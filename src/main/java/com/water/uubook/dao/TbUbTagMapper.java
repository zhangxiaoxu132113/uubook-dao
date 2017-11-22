package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbTagMapperExtend;
import com.water.uubook.model.TbUbTag;
import com.water.uubook.model.TbUbTagCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbTagMapper extends TbUbTagMapperExtend {
    int countByExample(TbUbTagCriteria example);

    int deleteByExample(TbUbTagCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbTag record);

    int insertSelective(TbUbTag record);

    List<TbUbTag> selectByExampleWithRowbounds(TbUbTagCriteria example, RowBounds rowBounds);

    List<TbUbTag> selectByExample(TbUbTagCriteria example);

    TbUbTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbTag record, @Param("example") TbUbTagCriteria example);

    int updateByExample(@Param("record") TbUbTag record, @Param("example") TbUbTagCriteria example);

    int updateByPrimaryKeySelective(TbUbTag record);

    int updateByPrimaryKey(TbUbTag record);

    int insertBatch(List<TbUbTag> list);
}