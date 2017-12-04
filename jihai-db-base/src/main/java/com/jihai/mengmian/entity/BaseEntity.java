package com.jihai.mengmian.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by kevinchen on 2016/12/23.
 */

@MappedSuperclass
public abstract class BaseEntity extends AbstractIdEntity<String> implements Operator {

    private static final long serialVersionUID = -846935144391631492L;

    @Column(updatable = false, name = "created_time")
    protected Date createdTime = new Date();
    protected Date modifiedTime = new Date();
    @Column(updatable = false, length = 36)
    protected String creatorId;
    @Column(length = 36)
    protected String modifierId;

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public void setOperator(String id) {
        this.modifierId = id;
    }

    @Override
    public String getOperator() {
        return this.modifierId;
    }

}