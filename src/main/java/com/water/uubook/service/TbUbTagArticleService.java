package com.water.uubook.service;

import com.water.uubook.model.TbUbTagArticle;

import java.util.List;

public interface TbUbTagArticleService {
    void deleteByArticleId(Integer articleId);

    void insertBatch(List<TbUbTagArticle> tbUbTagArticleList);
}