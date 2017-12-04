package com.jihai.mengmian.converter.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @Author: laiqiuhua.
 * @Date: 2017/8/13 11:45.
 */
public class NullObjectJsonSerializer extends JsonSerializer<Object> {
    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value == null) {
            gen.writeStartObject();
            gen.writeEndObject();
        } else {
            gen.writeObject(value);
        }
    }
}
