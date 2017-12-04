package com.jihai.mengmian.basebean;

/**
 * Created by fju on 2017/8/31.
 */
public enum DateType {
    DAY("DAY"),
    MONTH("MONTH"),
    YEAR("YEAR");
    private final String info;
    private DateType(String info) {
        this.info = info;
    }
    public  String getName() {
        return info;
    }
}
