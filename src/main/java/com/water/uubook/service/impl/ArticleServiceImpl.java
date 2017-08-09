package com.water.uubook.service.impl;

import com.water.uubook.dao.ArticleMapper;
import com.water.uubook.model.Article;
import com.water.uubook.model.ArticleCriteria;
import com.water.uubook.service.ArticleService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
}