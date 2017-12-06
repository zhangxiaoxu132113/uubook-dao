package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbTagArticleMapper;
import com.water.uubook.model.TbUbTagArticle;
import com.water.uubook.model.TbUbTagArticleCriteria;
import com.water.uubook.service.TbUbTagArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("tbUbTagArticleService")
public class TbUbTagArticleServiceImpl implements TbUbTagArticleService {
    @Resource
    private TbUbTagArticleMapper tagArticleMapper;

    @Override
    public void deleteByArticleId(Integer articleId) {
        TbUbTagArticleCriteria tbUbTagArticleCriteria = new TbUbTagArticleCriteria();
        TbUbTagArticleCriteria.Criteria criteria = tbUbTagArticleCriteria.createCriteria();
        criteria.andArticleIdEqualTo(articleId);
        tagArticleMapper.deleteByExample(tbUbTagArticleCriteria);
    }

    @Override
    public void insertBatch(List<TbUbTagArticle> tbUbTagArticleList) {
        tagArticleMapper.insertBatch(tbUbTagArticleList);
    }
}