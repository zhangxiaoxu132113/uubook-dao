package com.water.uubook.service;

import com.water.uubook.model.Category;
import com.water.uubook.model.dto.CategoryDto;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface CategoryService {
    /**
     * 根据名称获取分类
     */
    Category getCategoryByName(String name);

    /**
     * 根据id获取分类
     */
    CategoryDto getCategoryById(Integer categoryId) throws ExecutionException;

    /**
     * 获取热门分类
     */
    List<CategoryDto> getHotCategories() throws ExecutionException;

    /**
     * 获取所有的父级分类
     */
    List<CategoryDto> getAllParentCategories();
}