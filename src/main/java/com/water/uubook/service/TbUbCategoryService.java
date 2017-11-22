package com.water.uubook.service;

import com.water.uubook.model.TbUbCategory;
import com.water.uubook.model.dto.TbUbCategoryDto;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface TbUbCategoryService {
    /**
     * 根据名称获取分类
     */
    TbUbCategory getCategoryByName(String name);

    /**
     * 根据名称获取分类详情-使用缓存
     * @param name
     * @return
     */
    TbUbCategoryDto getCategoryByNameWithCache(String name);

    /**
     * 根据id获取分类
     */
    TbUbCategoryDto getCategoryById(Integer categoryId) throws ExecutionException;

    /**
     * 获取热门分类
     */
    List<TbUbCategoryDto> getHotCategories() throws ExecutionException;

    /**
     * 获取所有的父级分类
     */
    List<TbUbCategoryDto> getAllParentCategories();

    /**
     * 获取所有分类
     * @return
     */
    List<TbUbCategoryDto> getAllCategories();

    /**
     * 根据条件所获取分类集合
     * @param model
     * @param cols
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<TbUbCategoryDto> getCategoryByCondition(TbUbCategoryDto model, String[] cols, Integer currentPage, Integer pageSize);

    /**
     * 根据条件获取分类总数
     * @param model
     * @return
     */
    int countCategoryTotal(TbUbCategoryDto model);

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
    int updateCategory(TbUbCategory model);

    /**
     * 根据id查找分类
     * @param categoryId
     * @return
     */
    TbUbCategory findCategoryById(Integer categoryId);

    /**
     * 根据id查找父级分类
     * @param categoryId
     * @return
     */
    TbUbCategoryDto findpParentCategoryById(Integer categoryId);
}