package com.water.uubook.dao;

import com.water.uubook.dao.extend.ITTagMapperExtend;
import com.water.uubook.model.ITTag;
import com.water.uubook.model.ITTagCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ITTagMapper extends ITTagMapperExtend {
    int countByExample(ITTagCriteria example);

    int deleteByExample(ITTagCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ITTag record);

    int insertSelective(ITTag record);

    List<ITTag> selectByExampleWithRowbounds(ITTagCriteria example, RowBounds rowBounds);

    List<ITTag> selectByExample(ITTagCriteria example);

    ITTag selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ITTag record, @Param("example") ITTagCriteria example);

    int updateByExample(@Param("record") ITTag record, @Param("example") ITTagCriteria example);

    int updateByPrimaryKeySelective(ITTag record);

    int updateByPrimaryKey(ITTag record);

    int insertBatch(List<ITTag> list);
}