package com.water.uubook.dao.extend;

import com.water.uubook.model.dto.CategoryDto;

import java.util.List;
import java.util.Map;

public interface CategoryMapperExtend {
    List<CategoryDto> getAllCategory();

    List<CategoryDto> getCategoryByCondition(Map<String, Object> queryParams);
}