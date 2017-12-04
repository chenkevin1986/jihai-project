package com.jihai.mengmian.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by kevinchen on 2016/12/23.
 */
@MappedSuperclass
public class AbstractIdEntity<ID extends Serializable> implements Entity<ID>, Serializable {

    private static final long serialVersionUID = -9077980327887958900L;
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(length = 36)
    protected ID id; //自动生成id by uuid2

    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {
        this.id = id;
    }

    public boolean isNew() {
        if (this.id == null || "".equals(this.id)) {
            this.setId(null);
            return true;
        }

        return false;
    }

}