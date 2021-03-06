package com.water.uubook.dao.extend;

import com.water.uubook.model.ITArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ITArticleMapperExtend {
    List<ITArticle> getArticle(Map<String, Object> queryParam);

    int getTotalCount();
}