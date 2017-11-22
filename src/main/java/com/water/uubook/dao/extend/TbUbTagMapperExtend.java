package com.water.uubook.dao.extend;

import com.water.uubook.model.dto.TbUbTagDto;

import java.util.List;
import java.util.Map;

public interface TbUbTagMapperExtend {
    List<TbUbTagDto> getAllTags();

    List<TbUbTagDto> getTagsByCondition(Map<String, Object> queryParam);
}