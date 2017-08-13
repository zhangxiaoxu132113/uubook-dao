package com.water.uubook.dao.extend;

import com.water.uubook.model.CourseSubject;
import com.water.uubook.model.dto.CourseSubjectDto;

import java.util.List;
import java.util.Map;

public interface CourseSubjectMapperExtend {
    Integer insertReturnPrimaryKey(CourseSubject model);

    List<CourseSubjectDto> getAllCourseSubject();

    List<CourseSubjectDto> getAllCourseSubjectWithViewHits();

    List<CourseSubjectDto> getCourseSubjectByExample(Map<String, Object> queryMap);
}