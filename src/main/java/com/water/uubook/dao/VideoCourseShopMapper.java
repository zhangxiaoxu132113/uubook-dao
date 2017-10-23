package com.water.uubook.dao;

import com.water.uubook.dao.extend.VideoCourseShopMapperExtend;
import com.water.uubook.model.VideoCourseShop;
import com.water.uubook.model.VideoCourseShopCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VideoCourseShopMapper extends VideoCourseShopMapperExtend {
    int countByExample(VideoCourseShopCriteria example);

    int deleteByExample(VideoCourseShopCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoCourseShop record);

    int insertSelective(VideoCourseShop record);

    List<VideoCourseShop> selectByExampleWithRowbounds(VideoCourseShopCriteria example, RowBounds rowBounds);

    List<VideoCourseShop> selectByExample(VideoCourseShopCriteria example);

    VideoCourseShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoCourseShop record, @Param("example") VideoCourseShopCriteria example);

    int updateByExample(@Param("record") VideoCourseShop record, @Param("example") VideoCourseShopCriteria example);

    int updateByPrimaryKeySelective(VideoCourseShop record);

    int updateByPrimaryKey(VideoCourseShop record);

    int insertBatch(List<VideoCourseShop> list);
}