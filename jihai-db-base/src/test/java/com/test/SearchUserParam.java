package com.test;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by kevinchen on 2017/2/8.
 */
public class SearchUserParam {


    private String name;

    private String email;

    private String phone;

    private String userName;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date modifiedTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public SearchUserParam(){}

    public SearchUserParam(String name, String email, String phone, String userName, Date modifiedTime) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.modifiedTime = modifiedTime;
    }

}
