




package com.jihai.mengmian.appconst;

/**
 * Created by lixiaoxiao on 17-9-11.
 * 业务枚举类
 */
public enum BusinessConstant {
    /**
     *设备故障
     */
    FAULT_RESOLVED(0,"已解决"),
    FAULT_NOT_RESOLVED(1,"未解决"),
    /**
     *APP首页
     */
    APP_INDEX_PAGE_SAVE(1,"APP首页保存状态"),
    APP_INDEX_PAGE_RELEASE(2,"APP首页发布状态"),
    APP_INDEX_PAGE_HISTORY(3,"APP首页历史状态"),
    APP_SLEEP_DIY_REFRIGERATION(1,"制冷"),
    APP_SLEEP_DIY_HEATING(2,"制热"),
    APP_HOME_DISTANCE_NORMAL(0,"正常"),
    APP_HOME_DISTANCE_AWAY(1,"离家触发"),
    APP_HOME_DISTANCE_BACK(2,"回家触发"),
    //首页文件上传地址前缀
    UPLOAD_OSS_PREFIX_PATH_INDEXPAGE(0,"indexPage"),
    //图片上传地址前缀
    UPLOAD_OSS_PREFIX_PATH_IMAGE(1,"img");




    int value;
    String msg;

    BusinessConstant(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public int getValue() {
        return value;
    }

    public String getMsg() {
        return msg;
    }
}
