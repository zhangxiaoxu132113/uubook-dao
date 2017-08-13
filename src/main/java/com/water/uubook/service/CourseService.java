package com.water.uubook.service;

import com.water.uubook.model.dto.CourseDto;

import java.util.List;

public interface CourseService {

    /**
     * 根据课程名称获取课程目录
     */
    List<CourseDto> getCatalogByCourseName(String courseName);

}