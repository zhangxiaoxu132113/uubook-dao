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
     * 根据名称获取分类详情-使用缓存
     * @param name
     * @return
     */
    CategoryDto getCategoryByNameWithCache(String name);

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

    /**
     * 获取所有分类
     * @return
     */
    List<CategoryDto> getAllCategories();

    /**
     * 根据条件所获取分类集合
     * @param model
     * @param cols
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<CategoryDto> getCategoryByCondition(CategoryDto model, String[] cols, Integer currentPage, Integer pageSize);

    /**
     * 根据条件获取分类总数
     * @param model
     * @return
     */
    int countCategoryTotal(CategoryDto model);

    /**
     * 根据id删除分类
     * @param categoryId
     * @return
     */
    int delCategoryById(Integer categoryId);

    /**
     * 更新分类
     * @param model
     * @return
     */
    int updateCategory(Category model);

    /**
     * 根据id查找分类
     * @param categoryId
     * @return
     */
    Category findCategoryById(Integer categoryId);
}