package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbVedioCourseShopMapperExtend;
import com.water.uubook.model.TbUbVedioCourseShop;
import com.water.uubook.model.TbUbVedioCourseShopCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbVedioCourseShopMapper extends TbUbVedioCourseShopMapperExtend {
    int countByExample(TbUbVedioCourseShopCriteria example);

    int deleteByExample(TbUbVedioCourseShopCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbVedioCourseShop record);

    int insertSelective(TbUbVedioCourseShop record);

    List<TbUbVedioCourseShop> selectByExampleWithRowbounds(TbUbVedioCourseShopCriteria example, RowBounds rowBounds);

    List<TbUbVedioCourseShop> selectByExample(TbUbVedioCourseShopCriteria example);

    TbUbVedioCourseShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbVedioCourseShop record, @Param("example") TbUbVedioCourseShopCriteria example);

    int updateByExample(@Param("record") TbUbVedioCourseShop record, @Param("example") TbUbVedioCourseShopCriteria example);

    int updateByPrimaryKeySelective(TbUbVedioCourseShop record);

    int updateByPrimaryKey(TbUbVedioCourseShop record);

    int insertBatch(List<TbUbVedioCourseShop> list);
}