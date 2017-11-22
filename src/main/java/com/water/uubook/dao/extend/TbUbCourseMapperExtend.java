package com.water.uubook.dao.extend;

import com.water.uubook.model.TbUbCourse;
import com.water.uubook.model.dto.TbUbCourseDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUbCourseMapperExtend {
    Integer insertReturnPrimarykey(TbUbCourse course);

    List<TbUbCourseDto> getCatalogByCourseName(@Param("courseName") String courseName);
}