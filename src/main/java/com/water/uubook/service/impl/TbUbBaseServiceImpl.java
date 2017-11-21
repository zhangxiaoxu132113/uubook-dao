package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbBaseMapper;
import com.water.uubook.service.TbUbBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbUbBaseService")
public class TbUbBaseServiceImpl implements TbUbBaseService {
    @Resource
    private TbUbBaseMapper tbUbBaseMapper;
}