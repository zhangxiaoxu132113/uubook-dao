package com.water.uubook.service;

import com.water.uubook.model.TbUbTag;
import com.water.uubook.model.dto.TbUbTagDto;

import java.util.List;

public interface TbUbTagService {

    /**
     * 根据文章的标签id获取标签列表
     */
    List<TbUbTag> findArticleTags(String tags);

    /**
     * 根据条件获取标签集合
     * @param model
     * @param cols
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<TbUbTagDto> getTagsByCondition(TbUbTagDto model, String[] cols, int currentPage, int pageSize);

    /**
     * 根据条件计算标签数量
     * @param model
     * @return
     */
    int countTagTotal(TbUbTagDto model);

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
    int updateTag(TbUbTag model);

    List<TbUbTag> getAllTbUbTag();
}