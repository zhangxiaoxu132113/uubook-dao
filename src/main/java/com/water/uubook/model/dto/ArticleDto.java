package com.water.uubook.model.dto;

import com.water.uubook.model.Article;
import com.water.uubook.model.Tag;

import java.util.List;

/**
 * Created by mrwater on 2017/4/5.
 */
public class ArticleDto extends Article {
    private List<Article> relatedArticles;
    private List<Tag> tagList;

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public List<Article> getRelatedArticles() {
        return relatedArticles;
    }

    public void setRelatedArticles(List<Article> relatedArticles) {
        this.relatedArticles = relatedArticles;
    }
}
