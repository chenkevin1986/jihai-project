package com.jihai.mengmian.entity;

import com.jihai.mengmian.exception.GizwitsException;
import org.apache.commons.beanutils.PropertyUtilsBean;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class MapQueryParam {

    private Map<String, Object> values;
    private Object param = null;

    public MapQueryParam(Object param) {
        this.param = param;
        this.values = new HashMap<String, Object>();
        if (param != null) {
            try {
                PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
                PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(param);
                for (int i = 0; i < descriptors.length; i++) {
                    String name = descriptors[i].getName();
                    if (!"class".equals(name)) {
                        Object value = propertyUtilsBean.getNestedProperty(param, name);
                        if (value != null) {
                            values.put(name, value);
                        }
                    }
                }
            } catch (Throwable e) {
                throw new GizwitsException(5000);
            }
        }
    }

    public Map<String, Object> getValues() {
        return this.values;
    }

    public Object getParam() {
        return param;
    }

}