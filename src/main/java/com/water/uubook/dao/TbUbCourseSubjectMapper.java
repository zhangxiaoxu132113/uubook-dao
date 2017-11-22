package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbCourseSubjectMapperExtend;
import com.water.uubook.model.TbUbCourseSubject;
import com.water.uubook.model.TbUbCourseSubjectCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbCourseSubjectMapper extends TbUbCourseSubjectMapperExtend {
    int countByExample(TbUbCourseSubjectCriteria example);

    int deleteByExample(TbUbCourseSubjectCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbCourseSubject record);

    int insertSelective(TbUbCourseSubject record);

    List<TbUbCourseSubject> selectByExampleWithRowbounds(TbUbCourseSubjectCriteria example, RowBounds rowBounds);

    List<TbUbCourseSubject> selectByExample(TbUbCourseSubjectCriteria example);

    TbUbCourseSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbCourseSubject record, @Param("example") TbUbCourseSubjectCriteria example);

    int updateByExample(@Param("record") TbUbCourseSubject record, @Param("example") TbUbCourseSubjectCriteria example);

    int updateByPrimaryKeySelective(TbUbCourseSubject record);

    int updateByPrimaryKey(TbUbCourseSubject record);

    int insertBatch(List<TbUbCourseSubject> list);
}