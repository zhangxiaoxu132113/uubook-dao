package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbCeFetchUrlMapperExtend;
import com.water.uubook.model.TbCeFetchUrl;
import com.water.uubook.model.TbCeFetchUrlCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbCeFetchUrlMapper extends TbCeFetchUrlMapperExtend {
    int countByExample(TbCeFetchUrlCriteria example);

    int deleteByExample(TbCeFetchUrlCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCeFetchUrl record);

    int insertSelective(TbCeFetchUrl record);

    List<TbCeFetchUrl> selectByExampleWithRowbounds(TbCeFetchUrlCriteria example, RowBounds rowBounds);

    List<TbCeFetchUrl> selectByExample(TbCeFetchUrlCriteria example);

    TbCeFetchUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCeFetchUrl record, @Param("example") TbCeFetchUrlCriteria example);

    int updateByExample(@Param("record") TbCeFetchUrl record, @Param("example") TbCeFetchUrlCriteria example);

    int updateByPrimaryKeySelective(TbCeFetchUrl record);

    int updateByPrimaryKey(TbCeFetchUrl record);

    int insertBatch(List<TbCeFetchUrl> list);
}