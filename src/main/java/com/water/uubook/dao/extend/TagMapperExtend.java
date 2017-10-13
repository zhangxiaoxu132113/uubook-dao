package com.water.uubook.dao.extend;

import com.water.uubook.model.dto.TagDto;

import java.util.List;
import java.util.Map;

public interface TagMapperExtend {
    List<TagDto> getAllTags();

    List<TagDto> getTagsByCondition(Map<String, Object> queryParam);
}