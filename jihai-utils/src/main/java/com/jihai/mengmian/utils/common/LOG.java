package com.jihai.mengmian.utils.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kevinchen on 2016/12/14.
 */
public class LOG {
    /**以空间换时间*/
    private static Map<Class<?>,Logger> loggers = new ConcurrentHashMap<Class<?>,Logger>();


    private static Logger getLogger(Object obj) {
        Class<?> clazz = obj instanceof Class ? (Class<?>) obj : obj.getClass();
        Logger logger = loggers.get(clazz);
        if (logger == null) {
            logger = LoggerFactory.getLogger(clazz);
            loggers.put(clazz, logger);
        }
        return logger;
    }

    public static void info(Object obj , String contents){
        Logger logger = getLogger(obj);
        logger.info(contents);
    }

    public static void dubug(Object obj , String contents){
        Logger logger = getLogger(obj);
        logger.debug(contents);
    }

    public static void warn(Object obj , String contents){
        Logger logger = getLogger(obj);
        logger.warn(contents);
    }

    public static void error(Object obj , String contents){
        Logger logger = getLogger(obj);
        logger.error(contents);
    }

    public static void error(Object obj , String contents,Throwable e){
        Logger logger = getLogger(obj);
        logger.error(contents,e);
    }
}
