package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbIpAddressInfoMapper;
import com.water.uubook.service.TbUbIpAddressInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbUbIpAddressInfoService")
public class TbUbIpAddressInfoServiceImpl implements TbUbIpAddressInfoService {
    @Resource
    private TbUbIpAddressInfoMapper ipAddressInfoMapper;
}