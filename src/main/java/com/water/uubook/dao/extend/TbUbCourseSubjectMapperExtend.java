package com.water.uubook.dao.extend;

import com.water.uubook.model.TbUbCourseSubject;
import com.water.uubook.model.dto.CourseSubjectDto;

import java.util.List;
import java.util.Map;

public interface TbUbCourseSubjectMapperExtend {
    Integer insertReturnPrimaryKey(TbUbCourseSubject model);

    List<CourseSubjectDto> getAllCourseSubject();

    List<CourseSubjectDto> getAllCourseSubjectWithViewHits();

    List<CourseSubjectDto> getCourseSubjectByExample(Map<String, Object> queryMap);
}