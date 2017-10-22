package com.water.uubook.service.impl;

import com.water.uubook.dao.AccessLogInfoMapper;
import com.water.uubook.model.AccessLogInfo;
import com.water.uubook.model.AccessLogInfoCriteria;
import com.water.uubook.service.AccessLogInfoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("accessLogInfoService")
public class AccessLogInfoServiceImpl implements AccessLogInfoService {
    @Resource
    private AccessLogInfoMapper accessLogInfoMapper;
}