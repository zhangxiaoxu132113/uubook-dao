package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbCategoryMapperExtend;
import com.water.uubook.model.TbUbCategory;
import com.water.uubook.model.TbUbCategoryCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbCategoryMapper extends TbUbCategoryMapperExtend {
    int countByExample(TbUbCategoryCriteria example);

    int deleteByExample(TbUbCategoryCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbCategory record);

    int insertSelective(TbUbCategory record);

    List<TbUbCategory> selectByExampleWithRowbounds(TbUbCategoryCriteria example, RowBounds rowBounds);

    List<TbUbCategory> selectByExample(TbUbCategoryCriteria example);

    TbUbCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbCategory record, @Param("example") TbUbCategoryCriteria example);

    int updateByExample(@Param("record") TbUbCategory record, @Param("example") TbUbCategoryCriteria example);

    int updateByPrimaryKeySelective(TbUbCategory record);

    int updateByPrimaryKey(TbUbCategory record);

    int insertBatch(List<TbUbCategory> list);
}