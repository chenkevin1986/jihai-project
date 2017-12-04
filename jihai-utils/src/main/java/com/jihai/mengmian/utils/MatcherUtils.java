package com.jihai.mengmian.utils;

/**
 * Created by kevinchen on 2017/5/16.
 */
public class MatcherUtils {

    /**
     * 匹配带路径变量的url 【后面优化，将取消通过正则匹配的实现方式】
     * @param dbUrl 持久化的url格式为 {value1}/xxx/{value2}/yyy/{value3}/zzz
     * @param requestUrl 请求的路径是带有路径变量的URL
     *                   其中【rqRegex】这里的请求参数正则表达式支持字符 包括英文，数字，下划线与横线（uuid有横线）。
     * @return
     */
    public static boolean matcherPathvariable(String dbUrl,String requestUrl){
        String[] dbSplit = dbUrl.split("\\/"),
                rqSplit = requestUrl.split("\\/");
        if (dbSplit.length != rqSplit.length){
            return false;
        }
        String dbRegex = "[\\{]{1}[\\w\\d_-]+[\\}]{1}";
        String rqRegex = "[\\w\\d_-]+";
        int count = 0;
        for (int i = 0; i < dbSplit.length; i++) {
            String dbStr = dbSplit[i];
            String rqStr = rqSplit[i];
            if ((dbStr.matches(dbRegex) && rqStr.matches(rqRegex))
                    || dbStr.compareTo(rqStr)==0){
                count++;
            }
        }
        return count== dbSplit.length;
    }

}
