package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbBaseArticleMapperExtend;
import com.water.uubook.model.TbUbBaseArticle;
import com.water.uubook.model.TbUbBaseArticleCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbBaseArticleMapper extends TbUbBaseArticleMapperExtend {
    int countByExample(TbUbBaseArticleCriteria example);

    int deleteByExample(TbUbBaseArticleCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TbUbBaseArticle record);

    int insertSelective(TbUbBaseArticle record);

    List<TbUbBaseArticle> selectByExampleWithRowbounds(TbUbBaseArticleCriteria example, RowBounds rowBounds);

    List<TbUbBaseArticle> selectByExample(TbUbBaseArticleCriteria example);

    TbUbBaseArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbUbBaseArticle record, @Param("example") TbUbBaseArticleCriteria example);

    int updateByExample(@Param("record") TbUbBaseArticle record, @Param("example") TbUbBaseArticleCriteria example);

    int updateByPrimaryKeySelective(TbUbBaseArticle record);

    int updateByPrimaryKey(TbUbBaseArticle record);

    int insertBatch(List<TbUbBaseArticle> list);
}