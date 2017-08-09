package com.water.uubook.dao;

import com.water.uubook.dao.extend.TagArticleMapperExtend;
import com.water.uubook.model.TagArticle;
import com.water.uubook.model.TagArticleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TagArticleMapper extends TagArticleMapperExtend {
    int countByExample(TagArticleCriteria example);

    int deleteByExample(TagArticleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagArticle record);

    int insertSelective(TagArticle record);

    List<TagArticle> selectByExampleWithRowbounds(TagArticleCriteria example, RowBounds rowBounds);

    List<TagArticle> selectByExample(TagArticleCriteria example);

    TagArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagArticle record, @Param("example") TagArticleCriteria example);

    int updateByExample(@Param("record") TagArticle record, @Param("example") TagArticleCriteria example);

    int updateByPrimaryKeySelective(TagArticle record);

    int updateByPrimaryKey(TagArticle record);

    int insertBatch(List<TagArticle> list);
}