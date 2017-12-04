package com.jihai.mengmian.utils;


import org.apache.commons.collections.map.HashedMap;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * author: smart
 * time: 2016/12/14
 */

public class ReflexUtils {

    /**
     * 解析数据得到Map
     * @param object
     * @return
     */
    public static Map<String,Object> getContentValues(Object object){
        final Map<String,Object> cv = new HashedMap();
        Class c = object.getClass();
        Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getDeclaredMethods();

        for(Field field : fields) {
            final String fieldName = field.getName();
            String typeName = field.getType().getSimpleName();
            String getMethodName;
            if (typeName.equalsIgnoreCase("boolean")) {
                getMethodName = "is" + fieldName;
            } else {
                getMethodName = "get" + fieldName;
            }

            //找到对应的get方法
            Method method = getMethod(getMethodName, methods);
            //获取方法返回值得类型
            if (null != method) {
                String className = method.getReturnType().getSimpleName();

                try {
                    Object o = method.invoke(object);
                    getResult(className, o, new ValueTypeInterface() {
                        @Override
                        public void getValue(Integer result) {
                            cv.put(fieldName, result);
                        }

                        @Override
                        public void getValue(Boolean result) {
                            cv.put(fieldName, result);
                        }

                        @Override
                        public void getValue(Float result) {
                            cv.put(fieldName, result);
                        }

                        @Override
                        public void getValue(Double result) {
                            cv.put(fieldName, result);
                        }

                        @Override
                        public void getValue(Long result) {
                            cv.put(fieldName, result);
                        }

                        @Override
                        public void getValue(String result) {
                            cv.put(fieldName, result);
                        }

                        @Override
                        public void getValue(Byte result) {
                            cv.put(fieldName, result);
                        }
                    });
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }

        return cv;
    }

    /**
     * 从方法数组中查询得到方法
     * @param methodName
     * @param methods
     * @return
     */
    private static Method getMethod(String methodName,Method[] methods){
        Method method = null;
        for(Method m : methods){
            if(methodName.equalsIgnoreCase(m.getName())){
                method = m;
            }
        }
        return method;
    }

    private static <T> T getValue(Object object){

        return (T) object;
    }

    /**
     * 通过反射去实例化相应类
     *
     * @param <T> 返回实例的泛型类型
     * @return
     */
    public static <T> T getInstance(Class clazz) {
        try {
            return (T) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void getResult(String type,Object object,ValueTypeInterface vti){
        if(type.equalsIgnoreCase("int") || type.equalsIgnoreCase("Integer")){
            vti.getValue((Integer) getValue(object));
        }else if(type.equalsIgnoreCase("String")){
            vti.getValue((String) getValue(object));
        }else if(type.equalsIgnoreCase("Boolean")){
            vti.getValue((Boolean) getValue(object));
        }else if(type.equalsIgnoreCase("Float")){
            vti.getValue((Float) getValue(object));
        }else if(type.equalsIgnoreCase("Double")){
            vti.getValue((Double) getValue(object));
        }else if(type.equalsIgnoreCase("Long")){
            vti.getValue((Long) getValue(object));
        }else{
            vti.getValue((Byte) getValue(object));
        }
    }

    /**
     * 结果类型接口
     */
    private interface ValueTypeInterface{
        void getValue(Integer result);
        void getValue(Boolean result);
        void getValue(Float result);
        void getValue(Double result);
        void getValue(Long result);
        void getValue(String result);
        void getValue(Byte result);
    }
}
