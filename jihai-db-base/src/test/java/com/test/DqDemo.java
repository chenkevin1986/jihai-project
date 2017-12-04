package com.test;

import com.jihai.mengmian.dq.Criteria;
import com.jihai.mengmian.dq.Restrictions;
import com.jihai.mengmian.BeanUtils;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by kevinchen on 2017/2/14.
 */
public class DqDemo<T> {
    @Test
    public void test(){
        SearchUserParam searchUserParam = new SearchUserParam("kevin","kev","ddd","ddd",new Date());
        Field[] fields = searchUserParam.getClass().getDeclaredFields();
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            String name = field.getName();
            System.out.println(name);
            try {
                Object value = MethodUtils.invokeExactMethod(searchUserParam, "get" + WordUtils.capitalize(name),null);
                System.out.println("===== :::   "+value);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }



    }

    /**
     * 演示 其用法
     * @param searchUserParam
     * @return
     */
    public Criteria<T> findUserByContions(SearchUserParam searchUserParam){
        Criteria<T> c = new Criteria<T>();
        Field[] fields = searchUserParam.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            String param = field.getName();
            Object value = BeanUtils.getBeanAttrParam(searchUserParam,param);
            if (value==null) continue;
            if (param.equals("modifiedTime")){
                c.add(Restrictions.lt(param,value));
            }else{
                c.add(Restrictions.like(param, value.toString()));
            }
        }
        return c;
    }





}
