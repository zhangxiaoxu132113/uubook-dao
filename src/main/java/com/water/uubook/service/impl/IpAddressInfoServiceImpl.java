package com.water.uubook.service.impl;

import com.water.uubook.dao.IpAddressInfoMapper;
import com.water.uubook.model.IpAddressInfo;
import com.water.uubook.model.IpAddressInfoCriteria;
import com.water.uubook.service.IpAddressInfoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("ipAddressInfoService")
public class IpAddressInfoServiceImpl implements IpAddressInfoService {
    @Resource
    private IpAddressInfoMapper ipAddressInfoMapper;
}