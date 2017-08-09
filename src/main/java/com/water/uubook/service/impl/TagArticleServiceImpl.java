package com.water.uubook.service.impl;

import com.water.uubook.dao.TagArticleMapper;
import com.water.uubook.model.TagArticle;
import com.water.uubook.model.TagArticleCriteria;
import com.water.uubook.service.TagArticleService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("tagArticleService")
public class TagArticleServiceImpl implements TagArticleService {
    @Resource
    private TagArticleMapper tagArticleMapper;
}