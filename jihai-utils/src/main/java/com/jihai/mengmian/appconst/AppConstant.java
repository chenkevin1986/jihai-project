package com.jihai.mengmian.appconst;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevinchen on 2017/7/27.
 */
public class AppConstant {
    /**
     * 企业api相关的 enterpriseId
     */
    public static final String ENTERPRISE_ID ="5f4bfebe8d4545daafd9de5479283dd9";
    /**
     * 企业API相关的enterpriseSecret
     */
    public static final String ENTERPRISE_SECRET ="612483ed86074513bb84af9a39838d30";

    /**
     * 家用空调 productKey
     */
    public static final String HOME_WIFI_PRODUCT_KEY ="60c8cbbef8814de2951383f7040aef26";
    /**
     * 家用空调 productSecret
     */
    public static final String HOME_WIFI_PRODUCT_SECRET ="5c5d5618297345f8bab9266b4d8d8bc8";
    /**
     * 商用空调 productKey
     */
    public static final String BUSINESS_WIFI_PRODUCT_KEY ="031fd83a03d5403a963fb45d33d85a76";
    /**
     * 商用空调 productSecret
     */
    public static final String BUSINESS_WIFI_PRODUCT_SECRET ="2d5332b2f9c84029925db98d1ce9c718";
    /**
     * IOS app 应用appId
     */
    public static final String IOS_WIFI_APP_ID ="60b8eaa792aa4de1badf04fc20a8ba56";
    /**
     * IOS app 应用appSecret
     */
    public static final String IOS_WIFI_APP_SECRET ="832af0018b5f434f93c55fae32096f0b";
    /**
     * ANDROID app 应用appId
     */
    public static final String ANDROID_WIFI_APP_ID ="26df33dad15148c6932b233e5ec2bdd7";
    /**
     * ANDROID app 应用appSecret
     */
    public static final String ANDROID_WIFI_APP_SECRET ="e6e84f80f60740c1b458195f50c83c1f";

    /**
     * 封装appid与appSecret的映射关系
     */
    public static Map<String,String> APP_ID_SECRET_MAP=new HashMap<String,String>();
    static{
        APP_ID_SECRET_MAP.put(IOS_WIFI_APP_ID,IOS_WIFI_APP_SECRET);
        APP_ID_SECRET_MAP.put(ANDROID_WIFI_APP_ID,ANDROID_WIFI_APP_SECRET);
    }

    public static Map<String,String> PRODUCT_KEY_SECRET_MAP=new HashMap<String,String>();
    static{
        PRODUCT_KEY_SECRET_MAP.put(BUSINESS_WIFI_PRODUCT_KEY,BUSINESS_WIFI_PRODUCT_SECRET);
        PRODUCT_KEY_SECRET_MAP.put(HOME_WIFI_PRODUCT_KEY,HOME_WIFI_PRODUCT_SECRET);
    }

}
