package com.jihai.mengmian.utils;

import com.jihai.mengmian.utils.common.LOG;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;

/**
 * Created by kevinchen on 2017/3/19.
 */
public class PropertiesConfigUtil {

    public static void readProperties(String path, Class<?> cls) {
        File file = new File(path);
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(file));
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = entry.getKey().toString();
                Field field = cls.getDeclaredField(key);
                Class<?> type = field.getType();
                String simpleName = type.getSimpleName();
                Object value = null;
                if ("String[]".equals(simpleName)) {
                    value = entry.getValue().toString().split(",");
                }
                if ("String".equals(simpleName)) {
                    value = entry.getValue().toString();
                }
                if ("long".equals(simpleName)){
                    value = Long.parseLong(entry.getValue().toString());
                }
                if ("int".equals(simpleName)){
                    value = Integer.parseInt(entry.getValue().toString());
                }
                if ("boolean".equals(simpleName)){
                    value = Boolean.parseBoolean(entry.getValue().toString());
                }
                if ("double".equals(simpleName)){
                    value = Double.parseDouble(entry.getValue().toString());
                }
                if (value != null) {
                    field.set(field, value);
                } else {
                    LOG.info(PropertiesConfigUtil.class, "not support field type :" + simpleName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(PropertiesConfigUtil.class, "read properties error :", e);
        }
    }
}
