package com.jihai.mengmian.filter.annotation;

import com.jihai.mengmian.basebean.MenuTypeEnum;

import java.lang.annotation.*;

/**
 * 菜单权限 注释，提供权限过滤，菜单生成策略
 * @Author: laiqiuhua.
 * @Date: 2017/8/1 17:08.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PermissionMenu {

    /**
     *  菜单id
     * @return
     */
    String id();

    /**
     * 菜单名称
     * @return
     */
    String name();

    /**
     * 菜单类型
     * @return
     */
    MenuTypeEnum menuType();

    /**
     * 父菜单Id, module时为空，否则不为空
     * @return
     */
    String parentId() default "";

    /**
     * 描述，选填
     * @return
     */
    String description() default "";
}
