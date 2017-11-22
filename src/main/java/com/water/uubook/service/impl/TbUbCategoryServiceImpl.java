package com.water.uubook.service.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.water.uubook.dao.TbUbCategoryMapper;
import com.water.uubook.model.TbUbCategory;
import com.water.uubook.model.TbUbCategoryCriteria;
import com.water.uubook.model.dto.TbUbCategoryDto;
import com.water.uubook.service.TbUbCategoryService;
import com.water.uubook.utils.Constants;
import com.water.uubook.utils.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service("tbUbCategoryService")
public class TbUbCategoryServiceImpl implements TbUbCategoryService {
    @Resource
    private TbUbCategoryMapper categoryMapper;

    private LoadingCache<String, Object> cacheLocal;

    private static Log logger = LogFactory.getLog(TbUbCategoryServiceImpl.class);

    /**
     * 根据名称获取分类
     */
    public TbUbCategory getCategoryByName(String name) {
        TbUbCategoryCriteria categoryCriteria = new TbUbCategoryCriteria();
        TbUbCategoryCriteria.Criteria criteria = categoryCriteria.createCriteria();
        criteria.andNameEqualTo(name);

        List<TbUbCategory> categoryList = categoryMapper.selectByExample(categoryCriteria);
        if (categoryList != null && categoryList.size() > 0) {
            return categoryList.get(0);
        }
        return null;
    }

    /**
     * 根据名称获取分类详情-使用缓存
     * @param name
     * @return
     */
    public TbUbCategoryDto getCategoryByNameWithCache(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("category name 不能空");
        }
        TbUbCategoryDto tbUbCategoryDto = new TbUbCategoryDto();
        List<TbUbCategoryDto> tbUbCategoryDtoList = initializeCategoryList();
        tbUbCategoryDtoList.stream().forEach(p -> {
            if (p.getName()!= null && p.getName().equals(name)) {
                BeanUtils.copyProperties(p, tbUbCategoryDto);
            }
        });
        return tbUbCategoryDto;
    }

    @Override
    public TbUbCategoryDto getCategoryById(Integer categoryId) throws ExecutionException {
        Map<Integer, TbUbCategoryDto> categoryMap = (Map<Integer, TbUbCategoryDto>) cacheLocal.get(Constants.CacheKey.ALL_CATEGORY);
        return categoryMap.get(categoryId);
    }

    @Override
    public List<TbUbCategoryDto> getHotCategories() throws ExecutionException {
        List<TbUbCategoryDto> tbUbCategoryDtoList = initializeCategoryList();
        if (tbUbCategoryDtoList != null) {
            tbUbCategoryDtoList = tbUbCategoryDtoList.stream().filter(p -> p.getParentId() != null && p.getParentId() != 0).collect(Collectors.toList());
            tbUbCategoryDtoList.sort((TbUbCategoryDto c1, TbUbCategoryDto c2) -> c2.getTotal().compareTo(c1.getTotal()));
            if (tbUbCategoryDtoList.size() > 20) {
                return tbUbCategoryDtoList.subList(0, 20);
            }
        }
        return tbUbCategoryDtoList;
    }

    @Override
    public List<TbUbCategoryDto> getAllParentCategories() {
        List<TbUbCategoryDto> tbUbCategoryDtoList = initializeCategoryList();
        return tbUbCategoryDtoList.stream().filter(p -> p.getParentId() != null && p.getParentId() == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<TbUbCategoryDto> getAllCategories() {
        return initializeCategoryList();
    }

    @Override
    public List<TbUbCategoryDto> getCategoryByCondition(TbUbCategoryDto model, String[] cols, Integer currentPage, Integer pageSize) {
        Map<String, Object> queryParams = new HashMap<>();
        int begin = (currentPage - 1) * pageSize;
        queryParams.put("model", model);
        queryParams.put("begin", begin);
        queryParams.put("pageSize", pageSize);
        queryParams.put("cols", cols);

        List<TbUbCategoryDto> tbUbCategoryDtoList = categoryMapper.getCategoryByCondition(queryParams);
        tbUbCategoryDtoList.stream().forEach(p -> {
            p.setCreateOnStr(DateUtil.DATE_FORMAT_YMDHMS.format(p.getCreateTime()));
        });
        return tbUbCategoryDtoList;
    }

    @Override
    public int countCategoryTotal(TbUbCategoryDto model) {
        if (model == null) {
            throw new RuntimeException("参数不合法！");
        }
        TbUbCategoryCriteria categoryCriteria = new TbUbCategoryCriteria();
        TbUbCategoryCriteria.Criteria criteria = categoryCriteria.createCriteria();
        if (model.getId() != null) {
            criteria.andIdEqualTo(model.getId());
        }
        if (StringUtils.isNoneBlank(model.getName())) {
            criteria.andNameEqualTo(model.getName());
        }
        if (model.getParentId() != null) {
            criteria.andParentIdEqualTo(model.getParentId());
        }
        criteria.andParentIdNotEqualTo(0);
        return categoryMapper.countByExample(categoryCriteria);
    }

    @Override
    public int delCategoryById(Integer categoryId) {
        if (categoryId == null || categoryId < 0) {
            throw new RuntimeException("参数不合法!");
        }

        return categoryMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int updateCategory(TbUbCategory model) {
        if (model == null || model.getId() == null) {
            throw new RuntimeException("参数不合法！");
        }
        categoryMapper.updateByPrimaryKeySelective(model);
        return 0;
    }

    @Override
    public TbUbCategory findCategoryById(Integer categoryId) {
        if (categoryId == null) {
            throw new RuntimeException("参数不合法!");
        }
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public TbUbCategoryDto findpParentCategoryById(Integer categoryId) {
        TbUbCategoryDto tbUbCategoryDto = null;
        if (categoryId == null) {
            throw new RuntimeException("参数不合法!");
        }
        List<TbUbCategoryDto> tbUbCategoryDtoList = this.getAllParentCategories();
        for (TbUbCategoryDto tbUbCategoryDto1 : tbUbCategoryDtoList) {
            if (tbUbCategoryDto1.getId().equals(categoryId)) {
                tbUbCategoryDto = tbUbCategoryDto1;
            }
        }
        return tbUbCategoryDto;
    }


    private Map<Integer, TbUbCategoryDto> initializeTagMap() {
        Map<Integer, TbUbCategoryDto> categoryMap = new HashMap<>();
        List<TbUbCategoryDto> categoryList = categoryMapper.getAllCategory();
        for (TbUbCategoryDto a : categoryList) {
            for (TbUbCategoryDto b : categoryList) {
                if (b.getParentId() == a.getId()) {
                    if (a.getChildren() == null) a.setChildren(new ArrayList<>());
                    a.getChildren().add(b);
                    b.setParent(a);

                }
            }
            categoryMap.put(a.getId(), a);
        }
        return categoryMap;
    }

    private List<TbUbCategoryDto> initializeCategoryList() {
        List<TbUbCategoryDto> tbUbCategoryDtoList = new ArrayList<>();
        Map<Integer, TbUbCategoryDto> categoryMap = null;
        try {
            categoryMap = (Map<Integer, TbUbCategoryDto>) cacheLocal.get(Constants.CacheKey.ALL_CATEGORY);
            if (categoryMap == null) {
                categoryMap = initializeTagMap();
            }
            for (Map.Entry<Integer, TbUbCategoryDto> entry : categoryMap.entrySet()) {
                tbUbCategoryDtoList.add(entry.getValue());
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return tbUbCategoryDtoList;
    }



    @PostConstruct
    public void init() {
        logger.info("initialize cache ...");
        cacheLocal = CacheBuilder.newBuilder().refreshAfterWrite(1, TimeUnit.DAYS).build(
                new CacheLoader<String, Object>() {
                    @Override
                    public Object load(String key) {
                        switch (key) {
                            case Constants.CacheKey.ALL_CATEGORY:
                                return initializeTagMap();
                        }
                        return null;
                    }
                }
        );
    }
}