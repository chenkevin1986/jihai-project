package com.jihai.mengmian.converter.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * 集合Array控制格式化处理，如果为null格式化为[]
 * @Author: laiqiuhua.
 * @Date: 2017/8/12 23:35.
 */
public class NullArrayJsonSerializer extends JsonSerializer<Object> {
    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeStartArray();
            gen.writeEndArray();
        } else {
            gen.writeObject(value);
        }
    }

}
