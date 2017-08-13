package com.water.uubook.service.impl;

import com.water.uubook.dao.CourseMapper;
import com.water.uubook.model.dto.CourseDto;
import com.water.uubook.service.CourseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;


    @Override
    public List<CourseDto> getCatalogByCourseName(String courseName) {
        List<CourseDto> courseDtos = null;
        if (StringUtils.isNotBlank(courseName)) {
            courseDtos = courseMapper.getCatalogByCourseName(courseName);
        }
        return courseDtos;
    }

}