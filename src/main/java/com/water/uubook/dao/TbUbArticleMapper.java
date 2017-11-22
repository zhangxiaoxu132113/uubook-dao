package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbArticleMapperExtend;
import com.water.uubook.model.TbUbArticle;
import com.water.uubook.model.TbUbArticleCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbArticleMapper extends TbUbArticleMapperExtend {
    int countByExample(TbUbArticleCriteria example);

    int deleteByExample(TbUbArticleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbArticle record);

    int insertSelective(TbUbArticle record);

    List<TbUbArticle> selectByExampleWithBLOBsWithRowbounds(TbUbArticleCriteria example, RowBounds rowBounds);

    List<TbUbArticle> selectByExampleWithBLOBs(TbUbArticleCriteria example);

    List<TbUbArticle> selectByExampleWithRowbounds(TbUbArticleCriteria example, RowBounds rowBounds);

    List<TbUbArticle> selectByExample(TbUbArticleCriteria example);

    TbUbArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbArticle record, @Param("example") TbUbArticleCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TbUbArticle record, @Param("example") TbUbArticleCriteria example);

    int updateByExample(@Param("record") TbUbArticle record, @Param("example") TbUbArticleCriteria example);

    int updateByPrimaryKeySelective(TbUbArticle record);

    int updateByPrimaryKeyWithBLOBs(TbUbArticle record);

    int updateByPrimaryKey(TbUbArticle record);

    int insertBatch(List<TbUbArticle> list);
}