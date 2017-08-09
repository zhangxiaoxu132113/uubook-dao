package com.water.uubook.dao.extend;

import com.water.uubook.model.dto.CourseSubjectDto;

import java.util.List;
import java.util.Map;

public interface CourseSubjectMapperExtend {
    List<CourseSubjectDto> getAllCourseSubject();

    List<CourseSubjectDto> getCourseSubjectByExample(Map<String, Object> queryMap);
}