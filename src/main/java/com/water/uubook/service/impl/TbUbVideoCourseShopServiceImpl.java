package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbVedioCourseShopMapper;
import com.water.uubook.model.TbUbVedioCourseShop;
import com.water.uubook.model.TbUbVedioCourseShopCriteria;
import com.water.uubook.model.dto.TbUbArticleDto;
import com.water.uubook.model.dto.TbUbVedioCourseShopDto;
import com.water.uubook.service.TbUbArticleService;
import com.water.uubook.service.TbUbVideoCourseShopService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service("tbUbVideoCourseShopService")
public class TbUbVideoCourseShopServiceImpl implements TbUbVideoCourseShopService {
    @Resource
    private TbUbVedioCourseShopMapper videoCourseShopMapper;

    @Resource
    private TbUbArticleService tbUbArticleService;

    @Override
    public List<TbUbVedioCourseShop> findVideoCourseByCategory(Integer category) {
        if (category == null || category <= 0) {
            throw new RuntimeException("参数不合法！");
        }
        TbUbVedioCourseShopCriteria videoCourseShopCriteria = new TbUbVedioCourseShopCriteria();
        TbUbVedioCourseShopCriteria.Criteria criteria = videoCourseShopCriteria.createCriteria();
        criteria.andCategoryEqualTo(category);
        return videoCourseShopMapper.selectByExample(videoCourseShopCriteria);
    }

    @Override
    public List<TbUbVedioCourseShop> findVideoCourseInCategory(Integer... category) {
        if (category == null || category.length <= 0) {
            throw new RuntimeException("参数不合法！");
        }
        TbUbVedioCourseShopCriteria videoCourseShopCriteria = new TbUbVedioCourseShopCriteria();
        TbUbVedioCourseShopCriteria.Criteria criteria = videoCourseShopCriteria.createCriteria();
        criteria.andCategoryIn(Arrays.asList(category));
        return videoCourseShopMapper.selectByExample(videoCourseShopCriteria);
    }


    @Override
    public List<TbUbVedioCourseShop> findVideoCourseByTags(String... tags) {
        if (tags == null || tags.length == 0) {
            throw new RuntimeException("参数不合法！");
        }
        TbUbVedioCourseShopCriteria videoCourseShopCriteria = new TbUbVedioCourseShopCriteria();
        TbUbVedioCourseShopCriteria.Criteria criteria = videoCourseShopCriteria.createCriteria();
        criteria.andTagsIn(Arrays.asList(tags));
        return videoCourseShopMapper.selectByExample(videoCourseShopCriteria);
    }

    @Override
    public TbUbVedioCourseShopDto getVideoCourseById(int id) {
        TbUbVedioCourseShopDto tbUbVedioCourseShopDto = null;
        TbUbVedioCourseShop videoCourseShop = videoCourseShopMapper.selectByPrimaryKey(id);
        if (videoCourseShop != null) {
            tbUbVedioCourseShopDto = new TbUbVedioCourseShopDto();
            BeanUtils.copyProperties(videoCourseShop, tbUbVedioCourseShopDto);
            if (tbUbVedioCourseShopDto.getArticleId() != null) {
                TbUbArticleDto tbUbArticleDto = tbUbArticleService.findArticleById(tbUbVedioCourseShopDto.getArticleId());
                tbUbVedioCourseShopDto.setArticle(tbUbArticleDto);
            }
        }
        return tbUbVedioCourseShopDto;
    }
}