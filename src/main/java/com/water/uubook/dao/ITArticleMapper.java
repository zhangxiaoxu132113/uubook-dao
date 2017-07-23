package com.water.uubook.dao;

import com.water.uubook.dao.extend.ITArticleMapperExtend;
import com.water.uubook.model.ITArticle;
import com.water.uubook.model.ITArticleCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ITArticleMapper extends ITArticleMapperExtend {
    int countByExample(ITArticleCriteria example);

    int deleteByExample(ITArticleCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ITArticle record);

    int insertSelective(ITArticle record);

    List<ITArticle> selectByExampleWithBLOBsWithRowbounds(ITArticleCriteria example, RowBounds rowBounds);

    List<ITArticle> selectByExampleWithBLOBs(ITArticleCriteria example);

    List<ITArticle> selectByExampleWithRowbounds(ITArticleCriteria example, RowBounds rowBounds);

    List<ITArticle> selectByExample(ITArticleCriteria example);

    ITArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ITArticle record, @Param("example") ITArticleCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ITArticle record, @Param("example") ITArticleCriteria example);

    int updateByExample(@Param("record") ITArticle record, @Param("example") ITArticleCriteria example);

    int updateByPrimaryKeySelective(ITArticle record);

    int updateByPrimaryKeyWithBLOBs(ITArticle record);

    int updateByPrimaryKey(ITArticle record);

    int insertBatch(List<ITArticle> list);
}