package com.jihai.mengmian.utils;

import com.jihai.mengmian.exception.GizwitsException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by kevinchen on 2016/12/23.
 * 断言
 */
public class Assert {

    public final static Integer SYS_ERROR_CODE = 5000;

    public static void throwException() {
        throw new GizwitsException(SYS_ERROR_CODE);

    }

    public static void throwException(Integer errorKey) {
        throw new GizwitsException(errorKey);

    }

    public static void throwException(boolean expression, Integer errorKey) {
        if (!expression) {
            throw new GizwitsException(errorKey);
        }
    }

    public static void throwException(boolean expression, Integer errorKey, String errorMessage, Object... params) {
        if (!expression) {
            throw new GizwitsException(errorKey, errorMessage, params);
        }
    }

    public static void isTrue(boolean expression, Integer errorKey) {
        if (!expression) {
            throw new GizwitsException(errorKey);
        }
    }

    public static void isTrue(boolean expression, String errorMesage) {
        if (!expression) {
            throw new GizwitsException(500, errorMesage);
        }
    }

    public static void isNull(Object object, Integer errorKey) {
        if (object != null) {
            throw new GizwitsException(errorKey);
        }
    }

    public static void notNull(Object object, Integer errorKey) {
        if (object == null) {
            throw new GizwitsException(errorKey);
        }
    }

    public static void notEmpty(Object[] array, Integer errorKey) {
        if (ArrayUtils.isEmpty(array)) {
            throw new GizwitsException(errorKey);
        }
    }

    public static void notEmpty(Collection<?> collection, Integer errorKey) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new GizwitsException(errorKey);
        }
    }

    public static void notEmpty(Map<?, ?> map, Integer errorKey) {
        if (MapUtils.isEmpty(map)) {
            throw new GizwitsException(errorKey);
        }
    }

}