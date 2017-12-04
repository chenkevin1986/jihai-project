package com.jihai.mengmian.utils;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.StandardBasicTypes;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: laiqiuhua.
 * @Date: 2017/9/11 10:02.
 */
public class JpaResultTransformerUtil {
    public final static Map<String,AbstractSingleColumnStandardBasicType> standardBasicTypeMap;
    static {
        standardBasicTypeMap = new HashMap<>();//java类型对应的hibernate类型
        standardBasicTypeMap.put("int", StandardBasicTypes.INTEGER);
        standardBasicTypeMap.put("java.lang.Integer", StandardBasicTypes.INTEGER);
        standardBasicTypeMap.put("long", StandardBasicTypes.LONG);
        standardBasicTypeMap.put("java.lang.Long", StandardBasicTypes.LONG);
        standardBasicTypeMap.put("float", StandardBasicTypes.FLOAT);
        standardBasicTypeMap.put("java.lang.Float", StandardBasicTypes.FLOAT);
        standardBasicTypeMap.put("char", StandardBasicTypes.CHARACTER);
        standardBasicTypeMap.put("java.lang.Character", StandardBasicTypes.CHARACTER);
        standardBasicTypeMap.put("byte", StandardBasicTypes.BYTE);
        standardBasicTypeMap.put("java.lang.Byte", StandardBasicTypes.BYTE);
        standardBasicTypeMap.put("boolean", StandardBasicTypes.BOOLEAN);
        standardBasicTypeMap.put("java.lang.Boolean", StandardBasicTypes.BOOLEAN);
        standardBasicTypeMap.put("short", StandardBasicTypes.SHORT);
        standardBasicTypeMap.put("java.lang.Short", StandardBasicTypes.SHORT);
        standardBasicTypeMap.put("double", StandardBasicTypes.DOUBLE);
        standardBasicTypeMap.put("java.lang.Double", StandardBasicTypes.DOUBLE);
        standardBasicTypeMap.put("java.lang.String", StandardBasicTypes.STRING);
        standardBasicTypeMap.put("java.math.BigInteger", StandardBasicTypes.BIG_INTEGER);
        standardBasicTypeMap.put("java.util.Date", StandardBasicTypes.DATE);
    }

    public static <S> SQLQuery setResultTransformer(SQLQuery query, Class<S> clazz){//设置返回值
        query.setResultTransformer(Transformers.aliasToBean(clazz));
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String fieldName = fields[i].getName();
            String fieldType = fields[i].getGenericType().getTypeName();
            AbstractSingleColumnStandardBasicType basicType = standardBasicTypeMap.get(fieldType);
            if(basicType == null){
                throw new UnsupportedOperationException("不支持的字段类型：" + fieldType + ",字段名称：" + fieldName);
            }
            query.addScalar(fieldName, basicType);
        }
        return query;
    }

    public static <S> String getSelectSql(Class<S> clazz){//拼装查询字段
        StringBuffer selectSql = new StringBuffer("SELECT ");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String fieldName = fields[i].getName();
            selectSql.append(CamelTransferUtil.camelToUnderline(fieldName)).append(" AS ").append(fieldName).append(",");
        }
        selectSql.setLength(selectSql.length()-1);
        return selectSql.toString();
    }

}
