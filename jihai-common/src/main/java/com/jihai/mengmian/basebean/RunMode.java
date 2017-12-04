package com.jihai.mengmian.basebean;

/**
 * Created by fju on 2017/8/31.
 * 运行模式枚举
 */
public enum RunMode {
    AUTO(0),//自动
    COOLING(1),//制冷
    HEATING(2),//制热
    DEHUMIDIFY(3),//除湿
    BLOW(4);//送风
    private final int type;
    RunMode(int type) {
        this.type = type;
    }
    public  int getType() {
        return type;
    }
}
