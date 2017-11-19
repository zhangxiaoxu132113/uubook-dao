package com.water.uubook.model;

import java.io.Serializable;
import java.util.Date;

public class TbCeFetchArticleTaskRecord implements Serializable {
    private String id;

    private String taskId;

    private Integer urlNum;

    private Integer urlActualNum;

    private Integer type;

    private Date finishTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public Integer getUrlNum() {
        return urlNum;
    }

    public void setUrlNum(Integer urlNum) {
        this.urlNum = urlNum;
    }

    public Integer getUrlActualNum() {
        return urlActualNum;
    }

    public void setUrlActualNum(Integer urlActualNum) {
        this.urlActualNum = urlActualNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}