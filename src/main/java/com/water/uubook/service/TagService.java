package com.water.uubook.service;

import com.water.uubook.model.Tag;
import com.water.uubook.model.dto.TagDto;

import java.util.List;

public interface TagService {

    /**
     * 根据文章的标签id获取标签列表
     */
    List<Tag> findArticleTags(String tags);

    /**
     * 根据条件获取标签集合
     * @param model
     * @param cols
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<TagDto> getTagsByCondition(TagDto model, String[] cols, int currentPage, int pageSize);

    /**
     * 根据条件计算标签数量
     * @param model
     * @return
     */
    int countTagTotal(TagDto model);

    /**
     * 根据id删除标签
     * @param id
     * @return
     */
    int delTagById(Integer id);

    /**
     * 更新标签
     * @param model
     * @return
     */
    int updateTag(Tag model);
}