package com.jihai.mengmian;

import com.jihai.mengmian.utils.PropertiesConfigUtil;

/**
 * Created by kevinchen on 2017/6/11.
 */
public class GlobalParamsConstant {

    /**百度访问AK 调用百度地图相关api需要用到*/
    public static final String BAIDU_AK = "rHg4NzdG8RYdjtLUpGa3PVhpFxR8FGOP";

    public static void readProperties(){
        PropertiesConfigUtil.readProperties("g-globalproperties/global.properties", GlobalParamsConstant.class);
    }
}
