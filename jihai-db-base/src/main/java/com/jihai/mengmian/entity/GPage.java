package com.jihai.mengmian.entity;

import org.springframework.data.domain.*;

import java.util.List;

/**
 * Created by zohar on 17-1-20.
 */

/**
 * 接口分页查询返回结果的时候转化为类同 Django 的返回结果
 * 用于替换 org.springframework.data.domain.PageImpl
 * 达到样式风格统一
 *
 * @param <T>
 */
public class GPage<T> {

    private MetaBean meta;

    private List<T> objects;

    public MetaBean getMeta() {
        return meta;
    }

    public List<T> getObjects() {
        return objects;
    }

    /**
     * 分页参数
     */
    public static class MetaBean {
        private long total;
        private int limit;
        private int skip;

        public Long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public long getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getSkip() {
            return skip;
        }

        public void setSkip(int skip) {
            this.skip = skip;
        }

        public MetaBean(Long total, int limit, int skip) {
            this.total = total;
            this.limit = limit;
            this.skip = skip;
        }

        public MetaBean() {
        }
    }

    public GPage(MetaBean meta, List<T> objects) {
        this.meta = meta;
        this.objects = objects;
    }

    /**
     * 适配 PageImpl
     *
     * @param page
     */
    public GPage(Page<T> page) {
        this.meta = new MetaBean(page.getTotalElements(), page.getSize(), page.getNumber());
        this.objects = page.getContent();
    }
}
