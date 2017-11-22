package com.water.uubook.model.dto;

import com.water.uubook.model.TbUbVedioCourseShop;

/**
 * Created by mrwater on 2017/10/25.
 */
public class TbUbVedioCourseShopDto extends TbUbVedioCourseShop {
    private TbUbArticleDto article;

    public TbUbArticleDto getArticle() {
        return article;
    }

    public void setArticle(TbUbArticleDto article) {
        this.article = article;
    }
}
