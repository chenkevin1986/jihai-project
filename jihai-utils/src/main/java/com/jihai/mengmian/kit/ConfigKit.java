package com.jihai.mengmian.kit;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigKit {
    private static Properties properties = null;

    static {
        init("apis-config.properties", "utf-8");
    }

    public static String get(String key) {
        return get(key, null);
    }

    public static String get(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public static Integer getInt(String key) {
        return get(key) == null ? null : Integer.valueOf(get(key));
    }

    public static Integer getInt(String key, int defaultValue) {
        return get(key) == null ? defaultValue : Integer.valueOf(get(key));
    }

    public static Long getLong(String key) {
        return get(key) == null ? null : Long.valueOf(get(key));
    }

    public static Long getLong(String key, long defaultValue) {
        return get(key) == null ? defaultValue : Long.valueOf(get(key));
    }

    public static Boolean getBoolean(String key) {
        return get(key) == null ? null : Boolean.valueOf(get(key));
    }

    public static Boolean getBoolean(String key, boolean defaultValue) {
        return get(key) == null ? defaultValue : Boolean.valueOf(get(key));
    }

    public static Double getDouble(String key) {
        return get(key) == null ? null : Double.valueOf(get(key));
    }

    public static Double getDouble(String key, double defaultValue) {
        return get(key) == null ? defaultValue : Double.valueOf(get(key));
    }

    public static void init(String fileName, String encoding) {
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);        // properties.load(Prop.class.getResourceAsStream(fileName));
            if (inputStream == null)
                throw new IllegalArgumentException("Properties file not found in classpath: " + fileName);
            properties = new Properties();
            properties.load(new InputStreamReader(inputStream, encoding));
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file.", e);
        } finally {
            if (inputStream != null) try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }
}
