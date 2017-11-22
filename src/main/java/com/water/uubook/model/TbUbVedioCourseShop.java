package com.water.uubook.model;

import java.io.Serializable;
import java.util.Date;

public class TbUbVedioCourseShop implements Serializable {
    private Integer id;

    private String name;

    private Integer visitedCount;

    private Integer articleId;

    private Integer buyCount;

    private Integer category;

    private String tags;

    private String taobaoUrl;

    private String picUrl;

    private String taobaoPicUrl;

    private Date createOn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getVisitedCount() {
        return visitedCount;
    }

    public void setVisitedCount(Integer visitedCount) {
        this.visitedCount = visitedCount;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getTaobaoUrl() {
        return taobaoUrl;
    }

    public void setTaobaoUrl(String taobaoUrl) {
        this.taobaoUrl = taobaoUrl == null ? null : taobaoUrl.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getTaobaoPicUrl() {
        return taobaoPicUrl;
    }

    public void setTaobaoPicUrl(String taobaoPicUrl) {
        this.taobaoPicUrl = taobaoPicUrl == null ? null : taobaoPicUrl.trim();
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }
}