package com.water.uubook.service.impl;

import com.water.uubook.dao.TbCeFetchUrlMapper;
import com.water.uubook.service.TbCeFetchUrlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tbCeFetchUrlService")
public class TbCeFetchUrlServiceImpl implements TbCeFetchUrlService {
    @Resource
    private TbCeFetchUrlMapper tbCeFetchUrlMapper;
}