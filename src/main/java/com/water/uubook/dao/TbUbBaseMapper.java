package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbBaseMapperExtend;
import com.water.uubook.model.TbUbBase;
import com.water.uubook.model.TbUbBaseCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbBaseMapper extends TbUbBaseMapperExtend {
    int countByExample(TbUbBaseCriteria example);

    int deleteByExample(TbUbBaseCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TbUbBase record);

    int insertSelective(TbUbBase record);

    List<TbUbBase> selectByExampleWithBLOBsWithRowbounds(TbUbBaseCriteria example, RowBounds rowBounds);

    List<TbUbBase> selectByExampleWithBLOBs(TbUbBaseCriteria example);

    List<TbUbBase> selectByExampleWithRowbounds(TbUbBaseCriteria example, RowBounds rowBounds);

    List<TbUbBase> selectByExample(TbUbBaseCriteria example);

    TbUbBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbUbBase record, @Param("example") TbUbBaseCriteria example);

    int updateByExampleWithBLOBs(@Param("record") TbUbBase record, @Param("example") TbUbBaseCriteria example);

    int updateByExample(@Param("record") TbUbBase record, @Param("example") TbUbBaseCriteria example);

    int updateByPrimaryKeySelective(TbUbBase record);

    int updateByPrimaryKeyWithBLOBs(TbUbBase record);

    int updateByPrimaryKey(TbUbBase record);

    int insertBatch(List<TbUbBase> list);
}