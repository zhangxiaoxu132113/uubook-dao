package com.water.uubook.service;

import com.water.uubook.model.Article;
import com.water.uubook.model.dto.ArticleDto;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    /**
     * 根据文章id获取文章内容
     * @param articleId
     * @return
     */
    ArticleDto getArticleDetailById(Integer articleId);

    /**
     * 根据条件获取文章列表(分页)
     * @param model
     * @param queryField
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<ArticleDto> findArticleListByCondition(ArticleDto model, String[] queryField, Map<String, String> sortMap, int currentPage, int pageSize);

    /**
     * 关联标签获取文章列表（分页）
     * @param model
     * @param queryFeild
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<ArticleDto> findArticleListWithTagByCondition(ArticleDto model, String[] queryFeild, int currentPage, int pageSize);

    List<ArticleDto> getArticleTag(List<ArticleDto> list);

    ArticleDto findArticleById(Integer id);

    Integer countArticleTotal(ArticleDto model);

    Integer updateArticle(Article model);

    void delArticleById(Integer id);

    /**
     * 根据id数组获取文章列表
     * @param ids
     * @return
     */
    List<ArticleDto> findArticleListInIds(String[] cols, Integer[] ids);
}