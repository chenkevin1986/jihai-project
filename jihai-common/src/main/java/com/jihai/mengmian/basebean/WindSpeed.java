package com.jihai.mengmian.basebean;

/**
 * Created by fju on 2017/8/31.
 * 风速枚举
 */
public enum WindSpeed {
    LOW(0),//低风
    MID(1),//中风
    HIGH(2),//高风
    SILENT(3),//静音
    AUTO(4),//自动
    BURST(5),//强力
    CUSTOM(6);//自定义
    private final int type;
    WindSpeed(int type) {
        this.type = type;
    }
    public  int getType() {
        return type;
    }
}
