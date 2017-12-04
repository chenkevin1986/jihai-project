package com.jihai.mengmian.entity;

/**
 * Created by kevinchen on 2017/4/20.
 */
public enum RoleTag {
    COMMONROLE("普通管理员（手动创建）"),
    SUPPERROLE("超级管理员（系统自动创建，拥有所有权限）");

    private final String info;

    RoleTag(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
