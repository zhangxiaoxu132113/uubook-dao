package com.water.uubook.service;

import com.water.uubook.model.VideoCourseShop;

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
}