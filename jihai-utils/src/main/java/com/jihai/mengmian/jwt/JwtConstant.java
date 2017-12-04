package com.jihai.mengmian.jwt;

import com.jihai.mengmian.utils.PropertiesConfigUtil;

/**
 * Created by kevinchen on 2017/2/25.
 */
public class JwtConstant {
/*==========运营管理后台系统==============*/
    public static String JWT_ID;

    public static String JWT_SECRET;
    //token有效期
    public static long JWT_TTL;
    //刷新token的周期 小于7天
    public static long JWT_REFRESH_INTERVAL;
    //用于刷新token的refreshToken的过期时间 （30天）
    public static long JWT_REFRESH_TTL;

    /*==========为设备用户移动端app 提供服务的系统后台==============*/
    public static String APP_JWT_SECRET; // 对应appSecret.
    //APP token有效期
    public static long APP_JWT_TTL;


    public static void readProperties(){
        PropertiesConfigUtil.readProperties("globalproperties/jwt.properties", JwtConstant.class);
    }

}
