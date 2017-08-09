package com.water.uubook.dao;

import com.water.uubook.dao.extend.TagMapperExtend;
import com.water.uubook.model.Tag;
import com.water.uubook.model.TagCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TagMapper extends TagMapperExtend {
    int countByExample(TagCriteria example);

    int deleteByExample(TagCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    int insertSelective(Tag record);

    List<Tag> selectByExampleWithRowbounds(TagCriteria example, RowBounds rowBounds);

    List<Tag> selectByExample(TagCriteria example);

    Tag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagCriteria example);

    int updateByExample(@Param("record") Tag record, @Param("example") TagCriteria example);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);

    int insertBatch(List<Tag> list);
}