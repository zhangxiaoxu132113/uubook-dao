package com.water.uubook.dao.extend;

import com.water.uubook.model.dto.TbUbCategoryDto;

import java.util.List;
import java.util.Map;

public interface TbUbCategoryMapperExtend {
    List<TbUbCategoryDto> getAllCategory();

    List<TbUbCategoryDto> getCategoryByCondition(Map<String, Object> queryParams);
}