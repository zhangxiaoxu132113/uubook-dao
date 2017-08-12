package com.water.uubook.service;

import com.water.uubook.model.Tag;

import java.util.List;

public interface TagService {

    /**
     * 根据文章的标签id获取标签列表
     */
    List<Tag> findArticleTags(String tags);
}