package com.water.uubook.dao.extend;

import com.water.uubook.model.Course;

public interface CourseMapperExtend {
    Integer insertReturnPrimarykey(Course course);
}