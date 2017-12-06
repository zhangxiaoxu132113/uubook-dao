package com.water.uubook.service;

import com.water.uubook.model.TbUbArticle;
import com.water.uubook.model.dto.TbUbArticleDto;

import java.util.List;
import java.util.Map;

public interface TbUbArticleService {

    /**
     * 根据文章id获取文章内容
     * @param articleId
     * @return
     */
    TbUbArticleDto getArticleDetailById(Integer articleId);

    /**
     * 根据条件获取文章列表(分页)
     * @param model
     * @param queryField
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<TbUbArticleDto> findArticleListByCondition(TbUbArticleDto model, String[] queryField, Map<String, String> sortMap, int currentPage, int pageSize);

    /**
     * 关联标签获取文章列表（分页）
     * @param model
     * @param queryFeild
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<TbUbArticleDto> findArticleListWithTagByCondition(TbUbArticleDto model, String[] queryFeild, int currentPage, int pageSize);

    List<TbUbArticleDto> getArticleTag(List<TbUbArticleDto> list);

    TbUbArticleDto findArticleById(Integer id);

    Integer countArticleTotal(TbUbArticleDto model);

    Integer updateArticle(TbUbArticle model);

    void delArticleById(Integer id);

    /**
     * 根据id数组获取文章列表
     * @param ids
     * @return
     */
    List<TbUbArticleDto> findArticleListInIds(String[] cols, Integer[] ids);

    TbUbArticle selectByPrimaryKey(Integer articleId);

    void updateByPrimaryKeySelective(TbUbArticle article);
}