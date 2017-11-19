package com.water.uubook.model;

import java.io.Serializable;
import java.util.Date;

public class TbCeFetchArticleTask implements Serializable {
    private String id;

    private String name;

    private Integer taskType;

    private Integer status;

    private Integer urlNum;

    private Date lastFinishTime;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUrlNum() {
        return urlNum;
    }

    public void setUrlNum(Integer urlNum) {
        this.urlNum = urlNum;
    }

    public Date getLastFinishTime() {
        return lastFinishTime;
    }

    public void setLastFinishTime(Date lastFinishTime) {
        this.lastFinishTime = lastFinishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}