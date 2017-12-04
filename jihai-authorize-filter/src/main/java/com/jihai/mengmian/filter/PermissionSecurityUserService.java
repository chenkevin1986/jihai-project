package com.jihai.mengmian.filter;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kevinchen on 2017/3/26.
 * 拦截器业务逻辑的处理接口
 */
public interface PermissionSecurityUserService {
    /**
     * jwtId 一般用来用来表示客户端定义的appid.
     * @return
     */
    String getJwtId();

    /**
     * 不拦截某一些特定的消息头没有带token参数的请求路径
     * @param uri
     * @return
     */
    boolean notFilterNoAuthUri(String uri);

    /**
     * 从消息头的accessToken获取用户信息。
     * 然后用对应服务中各自的user对象解析即可。
     * 同时如果发生错误 该字符串就会解析成错误信息。
     * @return
     */
    String getSubjectFromAccessToken();

    /**
     * 放行请求路径
     * @param request
     * @return
     */
    boolean accessRequest(HttpServletRequest request);

    /**
     * 允许访问的消息头带有token参数的请求路径
     * @param request
     * @return
     */
    boolean alowAccessRequestUri(HttpServletRequest request);

    /**
     * 检验是否为 data(或查询GET请求)的请求路径
     * 若是 就允许通过。
     * @param uri
     * @return
     */
    boolean allowQueryRequestUri(String uri);


    boolean isTimeout();

    /**
     * 临时增加一些带消息头token的uri.
     * @param uris
     * @return 返回增加成功与否的结果json字符串
     */
    String addAlowAccessRequestUri(String[] uris);

    /**
     * 检查token是否有限
     * @return
     */
    boolean isAccessTokenInvaild();

    /**
     * 获取用户实体
     * @param <T>
     * @return
     */
    <T>T getUserEntity();

    /**
     * 获取用户客户端ip地址
     * @return
     */
    String getIp();

    /**
     * 获取用户客户端mac地址
     * @return
     */
    String getMac();

    SuitTypeEnum getSuitType();

}
