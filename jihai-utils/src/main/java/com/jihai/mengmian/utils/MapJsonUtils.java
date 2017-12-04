package com.jihai.mengmian.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevinchen on 2017/3/8.
 */
public class MapJsonUtils {

    public static Map<String,String> put(String[] ... keyValues){
        if (keyValues==null || keyValues.length == 0 )return null;
        Map<String,String> map = new HashMap<String,String>();
        for (int i = 0; i <keyValues.length ; i++) {
            String [] keyvalue = keyValues[i];
            if (keyvalue.length==0){
                return null;
            }
            if (keyvalue.length!=2){
                throw new RuntimeException("传入参数错误");
            }
            map.put(keyvalue[0],keyvalue[1]);
        }
        return map;
    }

    public static JSONObject putJson(String[] ... kvs){
        if (kvs==null)return null;
        JSONObject jsonObject = new JSONObject();
        for ( int i = 0 ; i <kvs.length ; i++ ) {
            String [] kv = kvs[i];
            if (kv.length==0)return null;
            if ( kv.length != 2 ){
                throw new RuntimeException("参数错误!");
            }
            jsonObject.put(kv[0],kv[1]);
        }
        return jsonObject;
    }
}
