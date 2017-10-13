package com.water.uubook.dao.extend;

import com.water.uubook.model.Article;
import com.water.uubook.model.dto.ArticleDto;

import java.util.List;
import java.util.Map;

public interface ArticleMapperExtend {
    List<Article> getArticle(Map<String, Object> var1);

    int getTotalCount(Map<String, Object> queryParam);

    List<ArticleDto> findArticleListByCondition(Map<String, Object> queryParam);

    List<ArticleDto> findArticleListOrderById(Map<String, Object> queryParam);

    List<ArticleDto> findArticleListInCategory(Map<String, Object> queryParam);

    List<ArticleDto> findArticleListInIds(Map<String, Object> queryParam);

    Integer insertReturnPrimaryKey(Article article);

    /**
     * 根据标签获取文章列表（分页）
     * @param queryParam
     * @return
     */
    List<ArticleDto> findArticleListWithTagByCondition(Map<String, Object> queryParam);
}
