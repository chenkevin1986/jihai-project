package com.jihai.mengmian.converter.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * 字符串控制格式化处理，如果为null格式化为“”
 * @Author: laiqiuhua.
 * @Date: 2017/8/13 11:45.
 */
public class NullStringJsonSerializer  extends JsonSerializer<Object> {
    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeString("");
        } else {
            gen.writeObject(value);
        }
    }

}
