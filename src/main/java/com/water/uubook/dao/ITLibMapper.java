package com.water.uubook.dao;

import com.water.uubook.dao.extend.ITLibMapperExtend;
import com.water.uubook.model.ITLib;
import com.water.uubook.model.ITLibCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ITLibMapper extends ITLibMapperExtend {
    int countByExample(ITLibCriteria example);

    int deleteByExample(ITLibCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ITLib record);

    int insertSelective(ITLib record);

    List<ITLib> selectByExampleWithRowbounds(ITLibCriteria example, RowBounds rowBounds);

    List<ITLib> selectByExample(ITLibCriteria example);

    ITLib selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ITLib record, @Param("example") ITLibCriteria example);

    int updateByExample(@Param("record") ITLib record, @Param("example") ITLibCriteria example);

    int updateByPrimaryKeySelective(ITLib record);

    int updateByPrimaryKey(ITLib record);

    int insertBatch(List<ITLib> list);
}