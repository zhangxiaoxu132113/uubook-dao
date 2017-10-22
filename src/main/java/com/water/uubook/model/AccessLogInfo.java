package com.water.uubook.model;

import java.io.Serializable;
import java.util.Date;

public class AccessLogInfo implements Serializable {
    private Integer id;

    private String requestUrl;

    private String requestIp;

    private String requestMethod;

    private Date accessDate;

    private Integer status;

    private Integer sendBytes;

    private Integer processRequestTime;

    private Date createOn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSendBytes() {
        return sendBytes;
    }

    public void setSendBytes(Integer sendBytes) {
        this.sendBytes = sendBytes;
    }

    public Integer getProcessRequestTime() {
        return processRequestTime;
    }

    public void setProcessRequestTime(Integer processRequestTime) {
        this.processRequestTime = processRequestTime;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }
}