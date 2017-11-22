package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbCourseMapper;
import com.water.uubook.model.dto.TbUbCourseDto;
import com.water.uubook.service.TbUbCourseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("tbUbCourseService")
public class TbUbCourseServiceImpl implements TbUbCourseService {
    @Resource
    private TbUbCourseMapper courseMapper;


    @Override
    public List<TbUbCourseDto> getCatalogByCourseName(String courseName) {
        List<TbUbCourseDto> tbUbCourseDtos = null;
        if (StringUtils.isNotBlank(courseName)) {
            tbUbCourseDtos = courseMapper.getCatalogByCourseName(courseName);
        }
        return tbUbCourseDtos;
    }

}