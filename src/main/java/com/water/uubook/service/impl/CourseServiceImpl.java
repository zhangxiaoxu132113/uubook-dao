package com.water.uubook.service.impl;

import com.water.uubook.dao.CourseMapper;
import com.water.uubook.model.Course;
import com.water.uubook.model.CourseCriteria;
import com.water.uubook.service.CourseService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;
}