package com.jihai.mengmian.filter.annotation;

import com.jihai.mengmian.basebean.MenuTypeEnum;
import com.jihai.mengmian.filter.SpringContextHolder;
import com.jihai.mengmian.session.SessionUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 权限注释实现支持
 * @Author: laiqiuhua.
 * @Date: 2017/8/2 9:49.
 */
public abstract class PermissionSupport {
    @Value("${server.contextPath}")
    protected String contextPath;

    /**
     * 生成菜单数据
     * @return
     */
    public List<Object[]> buildMenus() {
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = getHandlerMethods();
        List<Object[]> patternAndPermssion = new ArrayList<>();
        handlerMethods.forEach((requestMappingInfo, handlerMethod) -> {
            Set<String> patterns = requestMappingInfo.getPatternsCondition().getPatterns();
            PermissionMenu permissionMenu = handlerMethod.getMethodAnnotation(PermissionMenu.class);
            if(null != permissionMenu) {
                Object[] objects = new Object[2];
                objects[0] = patterns.stream().findFirst().get();
                objects[1] = permissionMenu;
                patternAndPermssion.add(objects);
//                System.out.print("patterns->" + Arrays.toString(objects));
            }
        });
        return patternAndPermssion;
    }

    /**
     * 判断控制器Type是否有 {@link PermissionFilter} 注解
     * @param handlerMethod
     * @return
     */
    private boolean isExistsClassFilter(HandlerMethod handlerMethod) {
        PermissionFilter classFilter = handlerMethod.getBeanType().getAnnotation(PermissionFilter.class);
        if(null != classFilter) {
            return true;
        }
        return false;
    }

    /**
     * 判断方法是否存在{@link PermissionFilter} 注解
     * @param handlerMethod
     * @return
     */
    private boolean HandleMethodFilter(HandlerMethod handlerMethod) {
        PermissionFilter methodFilter = handlerMethod.getMethodAnnotation(PermissionFilter.class);
        if(null == methodFilter) {
            return false;
        }
        if (methodFilter.filter()) {
            return true;
        }
        return false;
    }

    /**
     * 获取url映射相关信息
     * @return
     */
    private Map<RequestMappingInfo, HandlerMethod> getHandlerMethods() {
        RequestMappingHandlerMapping requestMapping = SpringContextHolder.getBean(RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMapping.getHandlerMethods();
        return handlerMethods;
    }

    private boolean handleClassFilter(HandlerMethod handlerMethod) {
        PermissionFilter classFilter = handlerMethod.getBeanType().getAnnotation(PermissionFilter.class);
        PermissionMenu permissionMenu = handlerMethod.getMethodAnnotation(PermissionMenu.class);
        // 没有过滤权限注解默认验证
        if(null == classFilter) {
            return false;
        }
        MenuTypeEnum[] menuTypeEnums = classFilter.filterType();
        List<MenuTypeEnum> menuTypeEnumList = Arrays.asList(menuTypeEnums);
        if(classFilter.filter() && menuTypeEnumList.contains(permissionMenu.menuType())) {
            return true;
        }
        return false;
    }

    public boolean hadlleFilter(HttpServletRequest request) {
        RequestMappingHandlerMapping requestMapping = SpringContextHolder.getBean(RequestMappingHandlerMapping.class);
        try {
            HandlerExecutionChain handlerExecutionChain = requestMapping.getHandler(request);
            HandlerMethod method = (HandlerMethod) handlerExecutionChain.getHandler();
            // 方法过滤权限优于class
            if (HandleMethodFilter(method)) {
                return true;
            } else {
                if(handleClassFilter(method)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 鉴权
     * @param request
     * @return
     */
    public boolean authentication(HttpServletRequest request, SessionUser sessionUser) {
        String uri = request.getRequestURI();
        if(!hadlleFilter(request)) {
            uri = uri.replaceFirst(contextPath, "");
            return sessionUser == null ? false : sessionUser.isAccessPermission(uri);
        }
        return false;
    }



}
