package com.jihai.mengmian.utils;


import com.jihai.mengmian.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevinchen on 2017/5/24.
 * 列表分页的EntityList 转 VoList 工具类
 */
public class PageUtils<V,E> {

    private final List<V> vos;

    private final Class<V> vClass;

    private final Page<E> entitys;

    public PageUtils(Class<V> vClass,Page<E> entitys){
        this.vClass =vClass;
        this.entitys = entitys;
        this.vos = new ArrayList<V>();
    }

    public Page<V> buildVosPage(){
        entitys.forEach(entity->{
            V vo = BeanUtils.copyAttrs(getInstance(),entity);
            if (vo!=null)
                vos.add(vo);
        });

        return new PageImpl<>(vos, new Pageable() {
            @Override
            public int getPageNumber() {
                return entitys.getNumber();
            }

            @Override
            public int getPageSize() {
                return entitys.getSize();
            }

            @Override
            public int getOffset() {
                return entitys.getSize()*entitys.getNumber();
            }

            @Override
            public Sort getSort() {
                return entitys.getSort();
            }

            @Override
            public Pageable next() {
                return entitys.nextPageable();
            }

            @Override
            public Pageable previousOrFirst() {
                return entitys.previousPageable();
            }

            @Override
            public Pageable first() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return !entitys.isFirst();
            }
        }, entitys.getTotalElements());
    }

    private V getInstance(){
        V v = null;
        try {
            v = vClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return v;
    }


}
