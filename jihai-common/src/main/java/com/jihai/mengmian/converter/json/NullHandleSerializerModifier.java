package com.jihai.mengmian.converter.json;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;

import java.util.List;

/**
 * null值json序列化处理
 * @Author: laiqiuhua.
 * @Date: 2017/8/12 23:33.
 */
public class NullHandleSerializerModifier extends BeanSerializerModifier {
    private JsonSerializer<Object> _nullArrayJsonSerializer = new NullArrayJsonSerializer();
    private JsonSerializer<Object> _nullObjectJsonSerializer = new NullObjectJsonSerializer();
    private JsonSerializer<Object> _nullStringJsonSerializer = new NullStringJsonSerializer();
    private JsonSerializer<Object> _nullIntegerJsonSerializer = new NullIntegerJsonSerializer();
    private JsonSerializer<Object> _nullBooleanJsonSerializer = new NullBooleanJsonSerializer();

    @Override
    public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc,
                                                     List<BeanPropertyWriter> beanProperties) {
        // 只修改ApiResponse序列化的json
//        if(ApiResponse.class.getClass().equals(beanDesc.getBeanClass())) {
            // 循环所有的beanPropertyWriter
            for (int i = 0; i < beanProperties.size(); i++) {
                BeanPropertyWriter writer = beanProperties.get(i);
                // 判断字段的类型，如果是array，list，set则注册nullSerializer
                if (isArrayType(writer)) {
                    //给writer注册一个自己的nullSerializer
                    writer.assignNullSerializer(this.defaultNullArrayJsonSerializer());
                } else if (isStringType(writer) ) {
                    writer.assignNullSerializer(this.defaultNullStringJsonSerializer());
                } else if (isIntegerType(writer)) {
                    writer.assignNullSerializer(this.defaultNullIntegerJsonSerializer());
                }
//                } else if (isBooleanType(writer)){
//                    writer.assignNullSerializer(this.defaultNullBooleanJsonSerializer());
//                }
            }
//        }

        return beanProperties;
    }

    /**
     * 判断是否是collection集合
     * @param writer
     * @return
     */
    private boolean isArrayType(BeanPropertyWriter writer) {
        JavaType javaType = writer.getType();
        return javaType.isCollectionLikeType();
    }

    /**
     * 判断属性是否是object类型或者其子类
     * @param writer
     * @return
     */
    private boolean isObjectType(BeanPropertyWriter writer) {
        JavaType javaType = writer.getType();
        return javaType.getRawClass() instanceof Object;
    }

    /**
     * 判断属性是否是字符类型
     * @param writer
     * @return
     */
    private boolean isStringType(BeanPropertyWriter writer) {
        JavaType javaType = writer.getType();
        return  javaType.isTypeOrSubTypeOf(String.class);
    }

    /**
     * 判断属性是否是整形类型
     * @param writer
     * @return
     */
    private boolean isIntegerType(BeanPropertyWriter writer) {
        JavaType javaType = writer.getType();
        return  javaType.isTypeOrSubTypeOf(int.class) || javaType.isTypeOrSubTypeOf(Integer.class);
    }

    /**
     * 判断属性是否是Bool
     * @param writer
     * @return
     */
    private boolean isBooleanType(BeanPropertyWriter writer) {
        JavaType javaType = writer.getType();
        return  javaType.isTypeOrSubTypeOf(boolean.class) || javaType.isTypeOrSubTypeOf(Boolean.class);
    }

    protected JsonSerializer<Object> defaultNullArrayJsonSerializer() {
        return _nullArrayJsonSerializer;
    }

    protected JsonSerializer<Object> defaultNullObjectJsonSerializer() {
        return _nullObjectJsonSerializer;
    }

    protected JsonSerializer<Object> defaultNullStringJsonSerializer() {
        return _nullStringJsonSerializer;
    }

    protected JsonSerializer<Object> defaultNullIntegerJsonSerializer() {
        return _nullIntegerJsonSerializer;
    }

    protected JsonSerializer<Object> defaultNullBooleanJsonSerializer() {
        return _nullBooleanJsonSerializer;
    }

}
