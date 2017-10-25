package com.water.uubook.service.impl;

import com.water.uubook.dao.VideoCourseShopMapper;
import com.water.uubook.model.VideoCourseShop;
import com.water.uubook.model.VideoCourseShopCriteria;
import com.water.uubook.service.VideoCourseShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service("videoCourseShopService")
public class VideoCourseShopServiceImpl implements VideoCourseShopService {
    @Resource
    private VideoCourseShopMapper videoCourseShopMapper;

    @Override
    public List<VideoCourseShop> findVideoCourseByCategory(Integer category) {
        if (category == null || category <= 0) {
            throw new RuntimeException("参数不合法！");
        }
        VideoCourseShopCriteria videoCourseShopCriteria = new VideoCourseShopCriteria();
        VideoCourseShopCriteria.Criteria criteria = videoCourseShopCriteria.createCriteria();
        criteria.andCategoryEqualTo(category);
        return videoCourseShopMapper.selectByExample(videoCourseShopCriteria);
    }

    @Override
    public List<VideoCourseShop> findVideoCourseInCategory(Integer... category) {
        if (category == null || category.length <= 0) {
            throw new RuntimeException("参数不合法！");
        }
        VideoCourseShopCriteria videoCourseShopCriteria = new VideoCourseShopCriteria();
        VideoCourseShopCriteria.Criteria criteria = videoCourseShopCriteria.createCriteria();
        criteria.andCategoryIn(Arrays.asList(category));
        return videoCourseShopMapper.selectByExample(videoCourseShopCriteria);
    }


    @Override
    public List<VideoCourseShop> findVideoCourseByTags(String... tags) {
        if (tags == null || tags.length == 0) {
            throw new RuntimeException("参数不合法！");
        }
        VideoCourseShopCriteria videoCourseShopCriteria = new VideoCourseShopCriteria();
        VideoCourseShopCriteria.Criteria criteria = videoCourseShopCriteria.createCriteria();
        criteria.andTagsIn(Arrays.asList(tags));
        return videoCourseShopMapper.selectByExample(videoCourseShopCriteria);
    }
}