package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbCourseMapperExtend;
import com.water.uubook.model.TbUbCourse;
import com.water.uubook.model.TbUbCourseCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbCourseMapper extends TbUbCourseMapperExtend {
    int countByExample(TbUbCourseCriteria example);

    int deleteByExample(TbUbCourseCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbCourse record);

    int insertSelective(TbUbCourse record);

    List<TbUbCourse> selectByExampleWithRowbounds(TbUbCourseCriteria example, RowBounds rowBounds);

    List<TbUbCourse> selectByExample(TbUbCourseCriteria example);

    TbUbCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbCourse record, @Param("example") TbUbCourseCriteria example);

    int updateByExample(@Param("record") TbUbCourse record, @Param("example") TbUbCourseCriteria example);

    int updateByPrimaryKeySelective(TbUbCourse record);

    int updateByPrimaryKey(TbUbCourse record);

    int insertBatch(List<TbUbCourse> list);
}