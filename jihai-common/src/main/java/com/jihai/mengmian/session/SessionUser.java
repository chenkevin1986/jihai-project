package com.jihai.mengmian.session;

import com.alibaba.fastjson.annotation.JSONField;
import com.jihai.mengmian.entity.UserTypeEnmu;

import java.io.Serializable;

/**
 * Created by kevinchen on 2017/2/25.
 */
public class SessionUser implements Serializable {

    private String uid;

    private String headImg;

    private String userName;

    private String nickName;

    private String phone;

    private String email;

    private SessionRole sessionRole;

    private long activeTime;//毫秒

    @JSONField(name = "userTypeEnmu")
    private UserTypeEnmu userTypeEnmu;

    public SessionUser() {
    }

    public SessionUser(String uid, String userName, String nickName, String phone, String email, UserTypeEnmu userTypeEnmu,SessionRole sessionRole) {
        this.uid = uid;
        this.userName = userName;
        this.nickName = nickName;
        this.phone = phone;
        this.email = email;
        this.sessionRole = sessionRole;
        this.userTypeEnmu = userTypeEnmu;
        this.activeTime = System.currentTimeMillis();
    }

    public UserTypeEnmu getUserTypeEnmu() {
        return userTypeEnmu;
    }

    public void setUserTypeEnmu(UserTypeEnmu userTypeEnmu) {
        this.userTypeEnmu = userTypeEnmu;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public long getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(long activeTime) {
        this.activeTime = activeTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SessionRole getSessionRole() {
        return sessionRole;
    }

    public void setSessionRole(SessionRole sessionRole) {
        this.sessionRole = sessionRole;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 是否已过期
     * @return
     */
    public boolean isExpire(long nowMillis){
        return nowMillis - activeTime >= SystemConstant.EXPIRE_TIME ? true : false;
    }

    //用户操作授权
    public boolean isAccessPermission(String menuLabelKey){
        return sessionRole !=null ? sessionRole.isExistMenulabelkey(menuLabelKey) : false;
    }

}
