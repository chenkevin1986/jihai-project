package com.jihai.mengmian.filter.annotation;

import com.jihai.mengmian.basebean.MenuTypeEnum;

import java.lang.annotation.*;

/**
 * 权限过滤
 * @Author: laiqiuhua.
 * @Date: 2017/8/2 9:10.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface PermissionFilter {
    /**
     * 是否过滤掉URL，不加入权限验证
     * @return
     */
    boolean filter() default false;

    /**
     * 仅当 {@link #filter} 为true, 此属性有效，只能应用在Type类型上, 默认过滤所有类型
     * @return
     */
    MenuTypeEnum[] filterType() default {MenuTypeEnum.MODULE, MenuTypeEnum.MENU, MenuTypeEnum.BUTTON};

}
