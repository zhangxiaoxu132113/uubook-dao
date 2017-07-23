package com.water.uubook.dao.extend;

import com.water.uubook.model.ITArticle;

import java.util.List;
import java.util.Map;

public interface ITArticleMapperExtend {
    List<ITArticle> getAllArticle(Map<String, Object> queryMap);
}