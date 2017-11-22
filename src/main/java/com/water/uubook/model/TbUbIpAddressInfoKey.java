package com.water.uubook.model;

import java.io.Serializable;

public class TbUbIpAddressInfoKey implements Serializable {
    private Integer id;

    private String ip;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}