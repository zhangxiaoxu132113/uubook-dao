package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbBaseArticleMapper;
import com.water.uubook.service.TbUbBaseArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbUbBaseArticleService")
public class TbUbBaseArticleServiceImpl implements TbUbBaseArticleService {
    @Resource
    private TbUbBaseArticleMapper tbUbBaseArticleMapper;
}