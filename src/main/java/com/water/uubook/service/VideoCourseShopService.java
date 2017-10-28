package com.water.uubook.service;

import com.water.uubook.model.VideoCourseShop;
import com.water.uubook.model.dto.VideoCourseShopDto;

import java.util.List;

public interface VideoCourseShopService {
    /**
     * 根据文章分类获取视频课程列表
     *
     * @param category
     * @return
     */
    List<VideoCourseShop> findVideoCourseByCategory(Integer category);

    List<VideoCourseShop> findVideoCourseInCategory(Integer ...category);

    /**
     * 根据标签获取视频课程列表
     *
     * @param tags
     * @return
     */
    List<VideoCourseShop> findVideoCourseByTags(String... tags);

    /**
     * 根据id获取视频教程的详情
     * @param id
     * @return
     */
    VideoCourseShopDto getVideoCourseById(int id);
}