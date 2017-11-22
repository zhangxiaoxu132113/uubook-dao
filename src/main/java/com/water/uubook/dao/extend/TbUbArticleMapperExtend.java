package com.water.uubook.dao.extend;

import com.water.uubook.model.TbUbArticle;
import com.water.uubook.model.dto.TbUbArticleDto;

import java.util.List;
import java.util.Map;

public interface TbUbArticleMapperExtend {
    List<TbUbArticle> getArticle(Map<String, Object> var1);

    int getTotalCount(Map<String, Object> queryParam);

    List<TbUbArticleDto> findArticleListByCondition(Map<String, Object> queryParam);

    List<TbUbArticleDto> findArticleListOrderById(Map<String, Object> queryParam);

    List<TbUbArticleDto> findArticleListInCategory(Map<String, Object> queryParam);

    List<TbUbArticleDto> findArticleListInIds(Map<String, Object> queryParam);

    Integer insertReturnPrimaryKey(TbUbArticle article);

    /**
     * 根据标签获取文章列表（分页）
     *
     * @param queryParam
     * @return
     */
    List<TbUbArticleDto> findArticleListWithTagByCondition(Map<String, Object> queryParam);
}
