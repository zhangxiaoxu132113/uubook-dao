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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    private LoadingCache<String, Object> cacheLocal;

    private static Log logger = LogFactory.getLog(CategoryServiceImpl.class);

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

    @Override
    public CategoryDto getCategoryById(Integer categoryId) throws ExecutionException {
        Map<Integer, CategoryDto> categoryMap = (Map<Integer, CategoryDto>) cacheLocal.get(Constants.CacheKey.ALL_CATEGORY);
        return categoryMap.get(categoryId);
    }

    @Override
    public List<CategoryDto> getHotCategories() throws ExecutionException {
        List<CategoryDto> categoryDtoList = initializeCategoryList();
        if (categoryDtoList != null) {
            categoryDtoList = categoryDtoList.stream().filter(p -> p.getParentId() != 0).collect(Collectors.toList());
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
        return categoryDtoList.stream().filter(p-> p.getParentId()==0).collect(Collectors.toList());
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
            return categoryDtoList;
        } catch (ExecutionException e) {
            throw new RuntimeException("access cache exception!");
        }
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