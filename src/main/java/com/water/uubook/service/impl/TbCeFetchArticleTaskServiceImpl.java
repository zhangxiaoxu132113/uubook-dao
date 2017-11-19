package com.water.uubook.service.impl;

import com.water.uubook.dao.TbCeFetchArticleTaskMapper;
import com.water.uubook.service.TbCeFetchArticleTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbCeFetchArticleTaskService")
public class TbCeFetchArticleTaskServiceImpl implements TbCeFetchArticleTaskService {
    @Resource
    private TbCeFetchArticleTaskMapper tbCeFetchArticleTaskMapper;
}