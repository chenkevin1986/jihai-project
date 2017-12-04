package com.jihai.mengmian;

import com.jihai.mengmian.utils.common.LOG;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by kevinchen on 2017/2/28.
 */
public class BeanUtils {
    /**
     * 通过对象属性名利用反射机制获取属性值( 调用get方法)
     * @param bean  标准的javabean  对象
     * @param attrName 属性名
     * @return 属性值
     */
    public static Object getBeanAttrParam(Object bean,String attrName){
        Object value = null;
        try {
            value = MethodUtils.invokeExactMethod(bean, "get" + WordUtils.capitalize(attrName),null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return value;
    }


    /**
     * 通过requestboy 可以获得 GET 请求的 uri 路径（"？"后面的路径）
     * @param requestBoy
     * @return
     */
    public static String getRequestUrlPath(Object requestBoy){
        if (requestBoy==null){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        sb.append("?");
        Field[] fields = requestBoy.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            String fieldName = field.getName();
            Object value = BeanUtils.getBeanAttrParam(requestBoy,fieldName);
            if (value!=null){
                sb.append(fieldName).append("=").append(value).append("&");
            }
        }
        String path = sb.toString();
        if(path.lastIndexOf("&") >0){
            path = path.substring(0,path.lastIndexOf("&"));
        }else{
            path = "";
        }
        return path;
    }

    /**
     * 复制两个Javabean中部分属性名称相同的值
     * @param target
     * @param source
     * @return
     */
    public static <T>T copyAttrs(T target, Object source){
        if (target==null || source == null){
            return null;
        }
        try {
            org.apache.commons.beanutils.BeanUtils.copyProperties(target,source);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return target;
    }

    private static Map typeMap = new HashMap();

    private static void initTypeMap(){
        typeMap.put("String",UUID.randomUUID().toString());
        typeMap.put("long",RandomUtils.nextLong(100000000l,100000000000l));
        typeMap.put("Long",Long.valueOf(RandomUtils.nextLong(100000000l,100000000000l)));
        typeMap.put("int",RandomUtils.nextInt(10000000,1000000000));
        typeMap.put("Integer",Integer.valueOf(RandomUtils.nextInt(10000000,1000000000)));
        typeMap.put("boolean",RandomUtils.nextInt(0,1)==0?true:false);
        typeMap.put("Boolean",Boolean.valueOf(RandomUtils.nextInt(0,1)==0?true:false));
        typeMap.put("double",RandomUtils.nextDouble(1,10000));
        typeMap.put("Double",Double.valueOf(RandomUtils.nextDouble(1,10000)));
    }


    private static int time = 0;

    /**
     * 构造假数据VO对象实例
     * @param cls
     * @param <V>
     * @return
     */
    public static <V>V getRandomInstance(Class<V> cls){
        V vo = null;
        try {
            vo = cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (vo==null)return vo;
        initTypeMap();
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i <fields.length; i++) {
            Field field = fields[i];
            Class<?> type = field.getType();
            String attrName = field.getName();
            String simpleName = type.getSimpleName();
            Object value = null;
            if (type.getClassLoader() != null ){
                time++;
                if (time >2){
                    continue;
                }
                value = getRandomInstance(type);
            }else{
                value = typeMap.get(simpleName);
            }
            if (value != null){
                String methodName = "set" + WordUtils.capitalize(attrName);
                try {
                    Method method = cls.getDeclaredMethod(methodName,type);
                    method.invoke(vo,value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }else{
                LOG.error(BeanUtils.class,"不支持该类型："+simpleName);
                continue;
            }
        }
        return vo;
    }

    //将javabean实体类转为map类型，然后返回一个map类型的值
    public static Map<String, Object> beanToMap(Object obj) {
        Map<String, Object> params = new HashMap<String, Object>(0);
        try {
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj);
            for (int i = 0; i < descriptors.length; i++) {
                String name = descriptors[i].getName();
                if (!"class".equals(name)) {
                    params.put(name, propertyUtilsBean.getNestedProperty(obj, name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }



}
