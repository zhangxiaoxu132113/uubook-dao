package com.water.uubook.service.impl;

import com.water.uubook.dao.VideoCourseShopMapper;
import com.water.uubook.model.VideoCourseShop;
import com.water.uubook.model.VideoCourseShopCriteria;
import com.water.uubook.service.VideoCourseShopService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("videoCourseShopService")
public class VideoCourseShopServiceImpl implements VideoCourseShopService {
    @Resource
    private VideoCourseShopMapper videoCourseShopMapper;
}