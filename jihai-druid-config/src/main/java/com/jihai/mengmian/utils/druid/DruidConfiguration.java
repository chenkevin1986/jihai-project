package com.jihai.mengmian.utils.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kevinchen on 2016/12/20.
 */
@Configuration
public class DruidConfiguration {

    @Value("${druid.urlMappings}")
    private String urlMappings;
    @Value("${druid.urlPatterns}")
    private String urlPatterns;
    @Value("${druid.exclusions}")
    private String exclusions;

    @Value("${druid.allow}")
    private String allow;
    @Value("${druid.deny}")
    private String deny;
    @Value("${druid.loginUsername}")
    private String loginUsername;
    @Value("${druid.loginPassword}")
    private String loginPassword;
    @Value("${druid.resetEnable}")
    private String resetEnable;


    /**
     * 注册一个StatViewServlet
     * @return
     */
    @Bean
    public ServletRegistrationBean DruidStatViewServle(){
        //org.springframework.boot.context.embedded.ServletRegistrationBean提供类的进行注册.
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),urlMappings);

        //添加初始化参数：initParams
        //白名单：
        servletRegistrationBean.addInitParameter("allow",allow);
        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
        servletRegistrationBean.addInitParameter("deny",deny);
        //登录查看信息的账号密码.
        servletRegistrationBean.addInitParameter("loginUsername",loginUsername);
        servletRegistrationBean.addInitParameter("loginPassword",loginPassword);
        //是否能够重置数据.
        servletRegistrationBean.addInitParameter("resetEnable",resetEnable);
        return servletRegistrationBean;
    }

    /**
     * 注册一个：filterRegistrationBean
     * @return
     */
    @Bean
    public FilterRegistrationBean druidStatFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则.
        filterRegistrationBean.addUrlPatterns(urlPatterns);
        //添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions",exclusions);
        return filterRegistrationBean;
    }
}
