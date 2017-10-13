package com.water.uubook.model;

import java.io.Serializable;

public class Article implements Serializable {
    private Integer id;

    private String title;

    private String description;

    private String author;

    private Integer category;

    private String reference;

    private String descryptUrl;

    private String releaseTime;

    private Long createOn;

    private Integer module;

    private Integer origin;

    private String tags;

    private Integer viewHits;

    private String picUrl;

    private Boolean enable;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getDescryptUrl() {
        return descryptUrl;
    }

    public void setDescryptUrl(String descryptUrl) {
        this.descryptUrl = descryptUrl == null ? null : descryptUrl.trim();
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime == null ? null : releaseTime.trim();
    }

    public Long getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Long createOn) {
        this.createOn = createOn;
    }

    public Integer getModule() {
        return module;
    }

    public void setModule(Integer module) {
        this.module = module;
    }

    public Integer getOrigin() {
        return origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getViewHits() {
        return viewHits;
    }

    public void setViewHits(Integer viewHits) {
        this.viewHits = viewHits;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}