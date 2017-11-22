package com.water.uubook.service;

import com.water.uubook.model.dto.CourseSubjectDto;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public interface TbUbCourseSubjectService {
    List<CourseSubjectDto> findAllCourseSubject() throws ExecutionException;

    CourseSubjectDto getCourseSubjectByExample(Map<String, Object> queryMap) throws ExecutionException;

    List<CourseSubjectDto> getRecommendCourseSubjectByTags(String[] tag);

    List<CourseSubjectDto> getHotCourseSubjectWithSize(int Size);
}