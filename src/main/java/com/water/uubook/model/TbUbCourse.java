package com.water.uubook.model;

import java.io.Serializable;

public class TbUbCourse implements Serializable {
    private Integer id;

    private Integer articleId;

    private Integer courseSubjectId;

    private Integer partentId;

    private String title;

    private Byte sort;

    private Long updateTime;

    private Long createOn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCourseSubjectId() {
        return courseSubjectId;
    }

    public void setCourseSubjectId(Integer courseSubjectId) {
        this.courseSubjectId = courseSubjectId;
    }

    public Integer getPartentId() {
        return partentId;
    }

    public void setPartentId(Integer partentId) {
        this.partentId = partentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Long createOn) {
        this.createOn = createOn;
    }
}