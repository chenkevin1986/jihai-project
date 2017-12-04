package com.jihai.mengmian.utils;

import com.jihai.mengmian.jwt.JwtUtils;
import com.jihai.mengmian.utils.common.LOG;
import io.jsonwebtoken.Claims;

import java.util.Date;

/**
 * Created by Toby Lai on 2017/5/15.
 */
public class AccesstokenUtil {
    private AccesstokenUtil() {}

    public static boolean isAccessTokenInvaild(String auth, String jwtKey) {
        if(auth == null || auth.length() <=7){
            LOG.error(AccesstokenUtil.class,"消息头格式不对！");
            return true;
        }
        String HeadStr = auth.substring(0, 6).toLowerCase();
        if (HeadStr.compareTo("bearer") != 0) {
            LOG.error(AccesstokenUtil.class,"tokenType 不对！");
            return true;
        }
        auth = auth.substring(7, auth.length());
        Claims claims = null;
        try{
            claims = JwtUtils.parseJWT(jwtKey,auth);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(claims==null){
            LOG.error(AccesstokenUtil.class,"token 错误，不能解析");
            return true;
        }
        if(new Date().after(claims.getExpiration())){
            LOG.error(AccesstokenUtil.class,"token过期");
            return true;
        }
        return false;
    }
}
