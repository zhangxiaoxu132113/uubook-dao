package com.water.uubook.service.impl;

import com.water.uubook.dao.TbCeFetchArticleTaskRecordMapper;
import com.water.uubook.service.TbCeFetchArticleTaskRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbCeFetchArticleTaskRecordService")
public class TbCeFetchArticleTaskRecordServiceImpl implements TbCeFetchArticleTaskRecordService {
    @Resource
    private TbCeFetchArticleTaskRecordMapper tbCeFetchArticleTaskRecordMapper;
}