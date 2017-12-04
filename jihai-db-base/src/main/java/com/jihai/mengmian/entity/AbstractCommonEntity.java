package com.jihai.mengmian.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * Created by fju on 2017/8/7.
 * 实体初始化数据，包括操作人，更新时间，逻辑删除
 */

@MappedSuperclass
public abstract class AbstractCommonEntity {
    @Column(name = "is_enable")
    protected Boolean enable;

    @Column(updatable = false)
    @CreatedDate
    protected Long createdAt; // 创建时间，UNIX时间戳，秒
    @Column
    @LastModifiedDate
    protected Long updatedAt;  // 修改时间，UNIX时间戳，秒
    @Column(updatable = false, length = 200)
    @CreatedBy
    protected String createdBy;
    @Column(length = 200)
    @LastModifiedBy
    protected String updatedBy;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @PrePersist
    public void prePersist() {
        this.createdAt = System.currentTimeMillis()/1000;
        this.updatedAt = System.currentTimeMillis()/1000;
        this.enable = true;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = System.currentTimeMillis()/1000;
    }


}
