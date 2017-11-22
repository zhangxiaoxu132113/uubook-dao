package com.water.uubook.service;

import com.water.uubook.model.dto.TbUbCourseDto;

import java.util.List;

public interface TbUbCourseService {

    /**
     * 根据课程名称获取课程目录
     */
    List<TbUbCourseDto> getCatalogByCourseName(String courseName);

}