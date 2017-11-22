package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbTagArticleMapper;
import com.water.uubook.service.TbUbTagArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbUbTagArticleService")
public class TbUbTagArticleServiceImpl implements TbUbTagArticleService {
    @Resource
    private TbUbTagArticleMapper tagArticleMapper;
}