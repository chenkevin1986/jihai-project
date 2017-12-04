package com.jihai.mengmian.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 逻辑删除操作, true代表可用，false代表删除
 * @Author: laiqiuhua.
 * @Date: 2017/7/31 11:18.
 */
@MappedSuperclass
public class AbstractEnableEntity {
    @Column(name = "is_enable")
    protected Boolean enable;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

}
