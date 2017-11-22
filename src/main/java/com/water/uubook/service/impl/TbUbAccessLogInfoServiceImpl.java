package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbAccessLogInfoMapper;
import com.water.uubook.service.TbUbAccessLogInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbUbAccessLogInfoService")
public class TbUbAccessLogInfoServiceImpl implements TbUbAccessLogInfoService {
    @Resource
    private TbUbAccessLogInfoMapper accessLogInfoMapper;
}