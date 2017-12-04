package com.jihai.mengmian;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kevinchen on 2017/5/4.
 */
public class BeanListUtils<T,S> {

    private List<T> targetList;

    private Class<T> tClass;

    public BeanListUtils(Class<T> tClass,List<S> sourceList) {
        this.tClass = tClass;
        this.targetList = new ArrayList<T>();
        if (sourceList != null){
            for(Iterator<S> iterator = sourceList.iterator(); iterator.hasNext();){
                S s = iterator.next();
                T t = BeanUtils.copyAttrs(getInstance(), s);
                if (t != null)
                    this.targetList.add(t);
            }
        }
    }

    private T getInstance(){
        T t = null;
        try {
            t = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

    public List<T> getTargetList() {
        return targetList;
    }
}
