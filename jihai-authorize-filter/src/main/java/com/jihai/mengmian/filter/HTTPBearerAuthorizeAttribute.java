package com.jihai.mengmian.filter;

import com.alibaba.fastjson.JSON;
import com.jihai.mengmian.syscode.BaseErrorCode;
import com.jihai.mengmian.syscode.Syscode;
import com.jihai.mengmian.utils.common.LOG;
import com.jihai.mengmian.web.ApiResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kevinchen on 2017/2/24.
 */
public class HTTPBearerAuthorizeAttribute implements Filter {

    public PermissionSecurityUserService permissionSecurityUserService;

    public HTTPBearerAuthorizeAttribute(PermissionSecurityUserService permissionSecurityUserService) {
        this.permissionSecurityUserService = permissionSecurityUserService;
    }

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)request;
        String requestURI = httpRequest.getRequestURI();
        String permissionUri = requestURI;
        if(permissionSecurityUserService.notFilterNoAuthUri(permissionUri)){
            chain.doFilter(request, response);
            return;
        }
        if(permissionSecurityUserService.accessRequest(httpRequest)){
            chain.doFilter(request, response);
            return;
        }
        if(permissionSecurityUserService.isAccessTokenInvaild()){
            responseMsg(response,HttpServletResponse.SC_UNAUTHORIZED, Syscode.JWT_TOKEN_INVALID);
            return;
        }

        if( !permissionSecurityUserService.allowQueryRequestUri(permissionUri)
            && !permissionSecurityUserService.alowAccessRequestUri(httpRequest)){
            LOG.error(this,"NOT_AUTHORIZATION :" + permissionUri);
            responseMsg(response,HttpServletResponse.SC_FORBIDDEN,Syscode.CLIENT_NOT_AUTHORIZATION);
            return;
        }
        if (permissionSecurityUserService.getUserEntity()== null){
            responseMsg(response, -1, Syscode.USER_SESSION_EXPIRAT);
            return;
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

    private static void responseMsg(ServletResponse response, int statusCode, BaseErrorCode syscode){
        if (response == null)return;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setCharacterEncoding("UTF-8");
        httpResponse.setContentType("application/json; charset=utf-8");
        if (statusCode > 0){
            httpResponse.setStatus(statusCode);
        }
        ApiResponse apiResponse = ApiResponse.prompt(syscode);
        try {
            httpResponse.getWriter().write(JSON.toJSONString(apiResponse));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
