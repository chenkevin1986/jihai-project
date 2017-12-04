package com.jihai.mengmian.entity;

/**
 * Created by kevinchen on 2017/2/17.
 */
public enum LoginStatus {
    OFF("未登录"),
    ONLINE("已登录");

    private final String info;

    private LoginStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
