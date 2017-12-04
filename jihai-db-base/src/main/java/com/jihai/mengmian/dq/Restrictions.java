package com.jihai.mengmian.dq;


import org.springframework.util.StringUtils;

import javax.persistence.criteria.JoinType;
import java.util.Collection;

/**
 * Created by kevinchen on 2017/2/8.
 */
public class Restrictions {

    /**
     * 等于
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression eq(String fieldName, Object value) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.EQ);
    }

    /**
     * @param clsName 关联的实体类名
     * @param cls     关联的实体类
     * @param fieldName 关联的实体对应的字段
     * @param value
     * @return
     */
    public static JoinExpression eq(String clsName,Class cls,String fieldName,Object value){
        if(StringUtils.isEmpty(value))return null;
        return new JoinExpression(cls,clsName,fieldName,value,Operator.EQ,JoinType.LEFT);
    }

    /**
     * 不等于
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression ne(String fieldName, Object value) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.NE);
    }

    public static JoinExpression ne(String clsName,Class cls,String fieldName,Object value){
        if(StringUtils.isEmpty(value))return null;
        return new JoinExpression(cls,clsName,fieldName,value,Operator.NE,JoinType.LEFT);
    }

    /**
     * 模糊匹配
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression like(String fieldName, String value) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.LIKE);
    }

    public static JoinExpression like(String clsName,Class cls,String fieldName,Object value){
        if(StringUtils.isEmpty(value))return null;
        return new JoinExpression(cls,clsName,fieldName,value,Operator.LIKE,JoinType.LEFT);
    }


    /**
     * 大于
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression gt(String fieldName, Object value ) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.GT);
    }

    /**
     * 小于
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression lt(String fieldName, Object value ) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.LT);
    }

    /**
     * 大于等于
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression lte(String fieldName, Object value ) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.GTE);
    }

    /**
     * 小于等于
     * @param fieldName
     * @param value
     * @return
     */
    public static SimpleExpression gte(String fieldName, Object value ) {
        if(StringUtils.isEmpty(value))return null;
        return new SimpleExpression (fieldName, value, Operator.LTE);
    }

    /**
     * 并且
     * @param criterions
     * @return
     */
    public static LogicalExpression and(Criterion... criterions){
        return new LogicalExpression(criterions, Operator.AND);
    }
    /**
     * 或者
     * @param criterions
     * @return
     */
    public static LogicalExpression or(Criterion... criterions){
        return new LogicalExpression(criterions, Operator.OR);
    }
    
    /**
     * 包含于
     * @param fieldName
     * @param value
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static LogicalExpression in(String fieldName, Collection value ) {
        if(value==null||value.isEmpty()){
            return null;
        }
        SimpleExpression[] ses = new SimpleExpression[value.size()];
        int i=0;
        for(Object obj : value){
            ses[i]=new SimpleExpression(fieldName,obj,Operator.EQ);
            i++;
        }
        return new LogicalExpression(ses,Operator.OR);
    }
}
