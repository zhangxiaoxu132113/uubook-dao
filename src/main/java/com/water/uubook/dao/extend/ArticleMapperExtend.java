package com.water.uubook.dao.extend;

import com.water.uubook.model.Article;
import com.water.uubook.model.ITArticle;

import java.util.List;
import java.util.Map;

public interface ArticleMapperExtend {
    List<Article> getArticle(Map<String, Object> var1);

    int getTotalCount();
}
