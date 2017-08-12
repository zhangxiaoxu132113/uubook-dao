package com.water.uubook.dao.extend;

import com.water.uubook.model.Article;
import com.water.uubook.model.ITArticle;
import com.water.uubook.model.dto.ArticleDto;

import java.util.List;
import java.util.Map;

public interface ArticleMapperExtend {
    List<Article> getArticle(Map<String, Object> var1);

    int getTotalCount();

    List<ArticleDto> findArticleListByCondition(Map<String, Object> queryParam);


    List<ArticleDto> findArticleListInCategory(Map<String, Object> queryParam);

    Integer insertReturnPrimaryKey(Article article);
}
