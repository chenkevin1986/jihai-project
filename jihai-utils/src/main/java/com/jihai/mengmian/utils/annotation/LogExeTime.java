package com.jihai.mengmian.utils.annotation;

import java.lang.annotation.*;

/**
 * Created by kevinchen on 2016/12/14.
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogExeTime {

    String description() default "";

    boolean log() default true;

    boolean exeTime() default true;

    MVCType mvcType() default MVCType.CONTROLLER;
}
