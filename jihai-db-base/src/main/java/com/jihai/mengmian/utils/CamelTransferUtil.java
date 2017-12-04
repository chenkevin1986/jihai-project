package com.jihai.mengmian.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  驼峰命名法转换工具
 * @Author: laiqiuhua.
 * @Date: 2017/9/11 10:21.
 */
public class CamelTransferUtil {
    public static final String UNDERLINE = "_";

    /**
     * 驼峰命名转下划线
     * @param param
     * @return
     */
    public static String camelToUnderline(String param){
        if (param==null || "".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (Character.isUpperCase(c)){
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 下划线转驼峰命名
     * @param param
     * @return
     */
    public static String underlineToCamel(String param){
        if (param==null || "".equals(param.trim())){
            return "";
        }
        StringBuilder sb=new StringBuilder(param);
        Matcher mc= Pattern.compile(UNDERLINE).matcher(param);
        int i=0;
        while (mc.find()){
            int position=mc.end()-(i++);
            sb.replace(position-1,position+1,sb.substring(position,position+1).toUpperCase());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String camel = CamelTransferUtil.camelToUnderline("iMIsALittleBeet");
        String underline = CamelTransferUtil.underlineToCamel(camel);
        System.out.println(camel);
        System.out.println(underline);
    }

}
