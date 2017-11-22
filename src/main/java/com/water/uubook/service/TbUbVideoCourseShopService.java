package com.water.uubook.service;

import com.water.uubook.model.TbUbVedioCourseShop;
import com.water.uubook.model.dto.TbUbVedioCourseShopDto;

import java.util.List;

public interface TbUbVideoCourseShopService {
    /**
     * 根据文章分类获取视频课程列表
     *
     * @param category
     * @return
     */
    List<TbUbVedioCourseShop> findVideoCourseByCategory(Integer category);

    List<TbUbVedioCourseShop> findVideoCourseInCategory(Integer... category);

    /**
     * 根据标签获取视频课程列表
     *
     * @param tags
     * @return
     */
    List<TbUbVedioCourseShop> findVideoCourseByTags(String... tags);

    /**
     * 根据id获取视频教程的详情
     * @param id
     * @return
     */
    TbUbVedioCourseShopDto getVideoCourseById(int id);
}