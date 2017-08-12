package com.water.uubook.service;

import com.water.uubook.model.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    List<ArticleDto> findArticleListByCondition(ArticleDto model, String[] queryField, int currentPage, int pageSize);

    List<ArticleDto> getArticleTag(List<ArticleDto> articleDtoList);
}