package com.water.uubook.dao;

import com.water.uubook.dao.extend.ITCategoryMapperExtend;
import com.water.uubook.model.ITCategory;
import com.water.uubook.model.ITCategoryCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ITCategoryMapper extends ITCategoryMapperExtend {
    int countByExample(ITCategoryCriteria example);

    int deleteByExample(ITCategoryCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ITCategory record);

    int insertSelective(ITCategory record);

    List<ITCategory> selectByExampleWithRowbounds(ITCategoryCriteria example, RowBounds rowBounds);

    List<ITCategory> selectByExample(ITCategoryCriteria example);

    ITCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ITCategory record, @Param("example") ITCategoryCriteria example);

    int updateByExample(@Param("record") ITCategory record, @Param("example") ITCategoryCriteria example);

    int updateByPrimaryKeySelective(ITCategory record);

    int updateByPrimaryKey(ITCategory record);

    int insertBatch(List<ITCategory> list);
}