package com.water.uubook.service.impl;

import com.water.uubook.dao.CourseSubjectMapper;
import com.water.uubook.model.CourseSubject;
import com.water.uubook.model.CourseSubjectCriteria;
import com.water.uubook.service.CourseSubjectService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("courseSubjectService")
public class CourseSubjectServiceImpl implements CourseSubjectService {
    @Resource
    private CourseSubjectMapper courseSubjectMapper;
}