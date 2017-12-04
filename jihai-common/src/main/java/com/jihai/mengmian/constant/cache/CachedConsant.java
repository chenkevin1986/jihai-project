package com.jihai.mengmian.constant.cache;

/**
 * 缓存前缀管理
 * @Author: laiqiuhua.
 * @Date: 2017/9/14 15:10.
 */
public final class CachedConsant {
    private CachedConsant() {}
    /**
     * 设备分享redis缓存前缀
     */
    public static final String DEVICE_SHARE_CACHED_PREFIX = "/device_share/";

    /**
     * 智能用电redis缓存前缀
     */
    public static final String DEVICE_SMART_ELECTRICITY_PREFIX = "/smart_electricity/";

    /**
     * 离家回家redis缓存前缀
     */
    public static final String HOME_DISTANCE_CACHED_PREFIX = "mqtt/distance/";

    /**
     * 滤网故障redis缓存前缀
     */
    public static final String DEVICE_FILTER_FAULT_PREFIX = "/FILTER/";

    /**
     *  设备型号redis缓存前缀
     */
    public static final String DEVICE_MODEL_PREFIX = "/deviceModelInfo/";

    /**
     * app用户redis缓存前缀
     */
    public static final String APP_USER_REDIS_PREFIX = "/app/users/";

}
