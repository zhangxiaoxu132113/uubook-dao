package com.water.uubook.service.impl;

import com.water.uubook.dao.TagMapper;
import com.water.uubook.model.Tag;
import com.water.uubook.model.TagCriteria;
import com.water.uubook.service.TagService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("tagService")
public class TagServiceImpl implements TagService {
    @Resource
    private TagMapper tagMapper;
}