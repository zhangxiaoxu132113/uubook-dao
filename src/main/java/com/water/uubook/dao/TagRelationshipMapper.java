package com.water.uubook.dao;

import com.water.uubook.dao.extend.TagRelationshipMapperExtend;
import com.water.uubook.model.TagRelationship;
import com.water.uubook.model.TagRelationshipCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TagRelationshipMapper extends TagRelationshipMapperExtend {
    int countByExample(TagRelationshipCriteria example);

    int deleteByExample(TagRelationshipCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagRelationship record);

    int insertSelective(TagRelationship record);

    List<TagRelationship> selectByExampleWithRowbounds(TagRelationshipCriteria example, RowBounds rowBounds);

    List<TagRelationship> selectByExample(TagRelationshipCriteria example);

    TagRelationship selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagRelationship record, @Param("example") TagRelationshipCriteria example);

    int updateByExample(@Param("record") TagRelationship record, @Param("example") TagRelationshipCriteria example);

    int updateByPrimaryKeySelective(TagRelationship record);

    int updateByPrimaryKey(TagRelationship record);

    int insertBatch(List<TagRelationship> list);
}