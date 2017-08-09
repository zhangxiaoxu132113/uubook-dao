package com.water.uubook.service.impl;

import com.water.uubook.dao.CategoryMapper;
import com.water.uubook.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
}