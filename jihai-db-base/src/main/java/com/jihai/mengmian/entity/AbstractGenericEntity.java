package com.jihai.mengmian.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * 实体初始化数据，包括操作人，更新时间
 * Created by Toby Lai on 2017/6/7.
 */
@MappedSuperclass
public abstract class AbstractGenericEntity implements Serializable {

    @Column(updatable = false)
    @CreatedDate
    protected Long createdAt; // 创建时间，UNIX时间戳，秒
    @Column
    @LastModifiedDate
    protected Long updateAt;  // 修改时间，UNIX时间戳，秒
    @Column(updatable = false, length = 200)
    @CreatedBy
    protected String createdBy;
    @Column(length = 200)
    @LastModifiedBy
    protected String updateBy;
    @Column
    protected String remark; // 备注

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @PrePersist
    public void prePersist() {
        Instant instant = Instant.now(Clock.system(ZoneId.of("Asia/Shanghai")));
        this.createdAt = instant.getEpochSecond();
        this.updateAt = instant.getEpochSecond();
    }

    @PreUpdate
    public void preUpdate() {
        Instant instant = Instant.now(Clock.system(ZoneId.of("Asia/Shanghai")));
        this.updateAt = instant.getEpochSecond();
    }

}
