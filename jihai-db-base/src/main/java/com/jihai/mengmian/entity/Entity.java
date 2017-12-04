package com.jihai.mengmian.entity;

import java.io.Serializable;

/**
 * Created by kevinchen on 2016/12/23.
 */
public interface Entity<ID extends Serializable> {

    public ID getId();

    public void setId(final ID id);

    public boolean isNew();

}