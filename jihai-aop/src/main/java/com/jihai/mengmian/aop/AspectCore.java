package com.jihai.mengmian.aop;

import com.alibaba.fastjson.JSON;
import com.jihai.mengmian.utils.annotation.LogExeTime;
import com.jihai.mengmian.utils.common.LOG;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by kevinchen on 2016/12/14.
 */
@Aspect
@Order(5)
@Component
public class AspectCore {
    //@Autowired
    //public RedisTemplate<String, String> redisTemplate;


    @Before(value = "@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void beforAdvice(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();
        try{
            if (target instanceof ErrorController) {
                LOG.info(target,"ERROR_PATH : " + ((ErrorController)target).getErrorPath());
                return;
            }
            //系统用户日志 之 获取（并注入）系统用户
           /** if (sessionUser != null && sessionUser.getUid() != null) {
                if (args != null) {
                    for (Object obj : args) {
                        if (obj instanceof BaseEntity) {
                            BaseEntity arg = (BaseEntity) obj;
                            arg.setCreatorId(sessionUser.getUid());
                            arg.setModifierId(sessionUser.getUid());
                        }
                    }
                }
            }*/
            Signature signature = joinPoint.getSignature();
            recordRequestContent(target,signature);
        }catch (Throwable e){
            LOG.error(this,"aop日志异常",e);
        }
    }

    @AfterReturning(returning = "ret", value = "@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void doAfterReturning(JoinPoint joinPoint,Object ret) {
        // 处理完请求，返回内容
        LOG.info(joinPoint.getTarget(),"RESPONSE : " + JSON.toJSONString(ret));
    }


    @Around(value = "@annotation(com.jihai.mengmian.utils.annotation.LogExeTime)")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();
        long startTime = System.currentTimeMillis();
        try{
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            LogExeTime logExeTime = method.getAnnotation(LogExeTime.class);
            String operName = null;
            boolean isflag = false;
            if(logExeTime.log()){
                operName = logExeTime.description();
                isflag = true;
            }
            String exeTimeInfo = null;
            if (logExeTime.exeTime()) {
                joinPoint.proceed(args);
                //String url = getUrlByRequestMapping(joinPoint.getTarget(), method);
                String excTime = (System.currentTimeMillis() - startTime) + "(ms)";
                exeTimeInfo = target.getClass().getName() + " -- " + method.toString() + " -- 方法执行时间 ："+excTime;
                isflag = true;
            }
            if (isflag){

                //systemLogRepository.save(new SystemLogEntity(sessionUser.getUid(),sessionUser.getUserName(),sessionUser.getNickName(),operName,exeTimeInfo,sessionUser.getIp()));
            }
        }catch (Throwable e){
            LOG.error(this," 记录操作日志错误",e);
        }
    }

   /* @Around(value = "@annotation(LogExeTime)")
    public void timeAroundAdvice(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Object target = joinPoint.getTarget();
        long startTime = System.currentTimeMillis();
        try {
            Object rt = joinPoint.proceed(args);
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            LogExeTime logExeTime = method.getAnnotation(LogExeTime.class);
            if (logExeTime.exeTime()) {
                String url = getUrlByRequestMapping(joinPoint.getTarget(), method);
                LOG.info(target,method.toString() + "方法执行时间 ： "
                        + (System.currentTimeMillis() - startTime) + "(ms)");
            }
        } catch (Throwable e) {
            LOG.error(target,"记录方法执行时间错误", e);
        }

    }*/



    /**
     * 记录下请求内容
     * @param target
     * @param signature
     */
    private void recordRequestContent(Object target,Signature signature){
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        LOG.info(target,"URL : " + request.getRequestURL().toString());
        LOG.info(target,"HTTP_METHOD : " + request.getMethod());
        LOG.info(target,"IP : " + request.getRemoteAddr());
        LOG.info(target,"CLASS_METHOD : " + signature.getDeclaringTypeName() + "." + signature.getName());
        LOG.info(target,"ARGS : " + showParams(request));
    }

    /**
     * 解析request参数
     * @param request
     * @return
     */
    private static String showParams(HttpServletRequest request ){
        StringBuffer sb = new StringBuffer();
        Map<String, String[]> parameterMap = request.getParameterMap();
        for(Iterator<Map.Entry<String, String[]>> iterator = parameterMap.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String, String[]> entry = iterator.next();
            sb.append(entry.getKey()).append("=");
            String[] values = entry.getValue();
            String value = values.length == 1 ? values[0] : Arrays.toString(values);
            sb.append(value);
            if (iterator.hasNext()){
                sb.append("&");
            }
        }
        return sb.toString();
    }

    /***
     * 解析RequestMapping 获得URL
     * @param target
     * @param method
     * @return
     */
    private static String getUrlByRequestMapping(Object target,Method method){
        RequestMapping requestMappingAnnotation = target.getClass().getAnnotation(RequestMapping.class);
        String url = "";
        if (requestMappingAnnotation != null) {
            String[] temp = requestMappingAnnotation.value();
           url = StringUtils.join(temp);
        }
        String[] value  = method.getAnnotation(RequestMapping.class).value();
        url = url + StringUtils.join(value);
        return url;
    }


}
