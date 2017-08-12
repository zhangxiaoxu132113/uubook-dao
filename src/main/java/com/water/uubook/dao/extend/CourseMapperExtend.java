package com.water.uubook.dao.extend;

import com.water.uubook.model.Course;
import com.water.uubook.model.dto.CourseDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapperExtend {
    Integer insertReturnPrimarykey(Course course);

    List<CourseDto> getCatalogByCourseName(@Param("courseName") String courseName);
}