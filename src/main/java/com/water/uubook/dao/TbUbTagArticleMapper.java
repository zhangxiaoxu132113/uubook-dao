package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbTagArticleMapperExtend;
import com.water.uubook.model.TbUbTagArticle;
import com.water.uubook.model.TbUbTagArticleCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbTagArticleMapper extends TbUbTagArticleMapperExtend {
    int countByExample(TbUbTagArticleCriteria example);

    int deleteByExample(TbUbTagArticleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbTagArticle record);

    int insertSelective(TbUbTagArticle record);

    List<TbUbTagArticle> selectByExampleWithRowbounds(TbUbTagArticleCriteria example, RowBounds rowBounds);

    List<TbUbTagArticle> selectByExample(TbUbTagArticleCriteria example);

    TbUbTagArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbTagArticle record, @Param("example") TbUbTagArticleCriteria example);

    int updateByExample(@Param("record") TbUbTagArticle record, @Param("example") TbUbTagArticleCriteria example);

    int updateByPrimaryKeySelective(TbUbTagArticle record);

    int updateByPrimaryKey(TbUbTagArticle record);

    int insertBatch(List<TbUbTagArticle> list);
}