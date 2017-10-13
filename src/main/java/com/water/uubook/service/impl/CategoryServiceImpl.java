package com.water.uubook.service.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.water.uubook.dao.CategoryMapper;
import com.water.uubook.model.Category;
import com.water.uubook.model.CategoryCriteria;
import com.water.uubook.model.dto.CategoryDto;
import com.water.uubook.service.CategoryService;
import com.water.uubook.utils.Constants;
import com.water.uubook.utils.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    private LoadingCache<String, Object> cacheLocal;

    private static Log logger = LogFactory.getLog(CategoryServiceImpl.class);

    /**
     * 根据名称获取分类
     */
    public Category getCategoryByName(String name) {
        CategoryCriteria categoryCriteria = new CategoryCriteria();
        CategoryCriteria.Criteria criteria = categoryCriteria.createCriteria();
        criteria.andNameEqualTo(name);

        List<Category> categoryList = categoryMapper.selectByExample(categoryCriteria);
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
    public CategoryDto getCategoryByNameWithCache(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new RuntimeException("category name 不能空");
        }
        CategoryDto categoryDto = new CategoryDto();
        List<CategoryDto> categoryDtoList = initializeCategoryList();
        categoryDtoList.stream().forEach(p -> {
            if (p.getName()!= null && p.getName().equals(name)) {
                BeanUtils.copyProperties(p, categoryDto);
            }
        });
        return categoryDto;
    }

    @Override
    public CategoryDto getCategoryById(Integer categoryId) throws ExecutionException {
        Map<Integer, CategoryDto> categoryMap = (Map<Integer, CategoryDto>) cacheLocal.get(Constants.CacheKey.ALL_CATEGORY);
        return categoryMap.get(categoryId);
    }

    @Override
    public List<CategoryDto> getHotCategories() throws ExecutionException {
        List<CategoryDto> categoryDtoList = initializeCategoryList();
        if (categoryDtoList != null) {
            categoryDtoList = categoryDtoList.stream().filter(p -> p.getParentId() != null && p.getParentId() != 0).collect(Collectors.toList());
            categoryDtoList.sort((CategoryDto c1, CategoryDto c2) -> c2.getTotal().compareTo(c1.getTotal()));
            if (categoryDtoList.size() > 20) {
                return categoryDtoList.subList(0, 20);
            }
        }
        return categoryDtoList;
    }

    @Override
    public List<CategoryDto> getAllParentCategories() {
        List<CategoryDto> categoryDtoList = initializeCategoryList();
        return categoryDtoList.stream().filter(p-> p.getParentId() != null && p.getParentId()==0)
                .collect(Collectors.toList());
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return initializeCategoryList();
    }

    @Override
    public List<CategoryDto> getCategoryByCondition(CategoryDto model, String[] cols, Integer currentPage, Integer pageSize) {
        Map<String, Object> queryParams = new HashMap<>();
        int begin = (currentPage - 1) * pageSize;
        queryParams.put("model", model);
        queryParams.put("begin", begin);
        queryParams.put("pageSize", pageSize);
        queryParams.put("cols", cols);

        List<CategoryDto> categoryDtoList = categoryMapper.getCategoryByCondition(queryParams);
        categoryDtoList.stream().forEach(p -> {
            p.setCreateOnStr(DateUtil.DATE_FORMAT_YMDHMS.format(p.getCreateTime()));
        });
        return categoryDtoList;
    }

    @Override
    public int countCategoryTotal(CategoryDto model) {
        if (model == null) {
            throw new RuntimeException("参数不合法！");
        }
        CategoryCriteria categoryCriteria = new CategoryCriteria();
        CategoryCriteria.Criteria criteria = categoryCriteria.createCriteria();
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
    public int updateCategory(Category model) {
        if (model == null || model.getId() == null) {
            throw new RuntimeException("参数不合法！");
        }
        categoryMapper.updateByPrimaryKeySelective(model);
        return 0;
    }

    @Override
    public Category findCategoryById(Integer categoryId) {
        if (categoryId == null) {
            throw new RuntimeException("参数不合法!");
        }
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    private Map<Integer, CategoryDto> initializeTagMap() {
        Map<Integer, CategoryDto> categoryMap = new HashMap<>();
        List<CategoryDto> categoryList = categoryMapper.getAllCategory();
        for (CategoryDto a : categoryList) {
            for (CategoryDto b : categoryList) {
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

    private List<CategoryDto> initializeCategoryList() {
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        Map<Integer, CategoryDto> categoryMap = null;
        try {
            categoryMap = (Map<Integer, CategoryDto>) cacheLocal.get(Constants.CacheKey.ALL_CATEGORY);
            if (categoryMap == null) {
                categoryMap = initializeTagMap();
            }
            for (Map.Entry<Integer, CategoryDto> entry : categoryMap.entrySet()) {
                categoryDtoList.add(entry.getValue());
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return categoryDtoList;
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