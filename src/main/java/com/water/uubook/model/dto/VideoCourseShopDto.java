package com.water.uubook.model.dto;

import com.water.uubook.model.VideoCourseShop;

/**
 * Created by mrwater on 2017/10/25.
 */
public class VideoCourseShopDto extends VideoCourseShop {
    private ArticleDto article;

    public ArticleDto getArticle() {
        return article;
    }

    public void setArticle(ArticleDto article) {
        this.article = article;
    }
}
