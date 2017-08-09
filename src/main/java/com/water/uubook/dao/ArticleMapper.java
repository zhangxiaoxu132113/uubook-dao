package com.water.uubook.dao;

import com.water.uubook.dao.extend.ArticleMapperExtend;
import com.water.uubook.model.Article;
import com.water.uubook.model.ArticleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArticleMapper extends ArticleMapperExtend {
    int countByExample(ArticleCriteria example);

    int deleteByExample(ArticleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBsWithRowbounds(ArticleCriteria example, RowBounds rowBounds);

    List<Article> selectByExampleWithBLOBs(ArticleCriteria example);

    List<Article> selectByExampleWithRowbounds(ArticleCriteria example, RowBounds rowBounds);

    List<Article> selectByExample(ArticleCriteria example);

    Article selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleCriteria example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleCriteria example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    int insertBatch(List<Article> list);
}