package com.water.uubook.dao;

import com.water.uubook.dao.extend.CourseSubjectMapperExtend;
import com.water.uubook.model.CourseSubject;
import com.water.uubook.model.CourseSubjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CourseSubjectMapper extends CourseSubjectMapperExtend {
    int countByExample(CourseSubjectCriteria example);

    int deleteByExample(CourseSubjectCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseSubject record);

    int insertSelective(CourseSubject record);

    List<CourseSubject> selectByExampleWithRowbounds(CourseSubjectCriteria example, RowBounds rowBounds);

    List<CourseSubject> selectByExample(CourseSubjectCriteria example);

    CourseSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseSubject record, @Param("example") CourseSubjectCriteria example);

    int updateByExample(@Param("record") CourseSubject record, @Param("example") CourseSubjectCriteria example);

    int updateByPrimaryKeySelective(CourseSubject record);

    int updateByPrimaryKey(CourseSubject record);

    int insertBatch(List<CourseSubject> list);
}