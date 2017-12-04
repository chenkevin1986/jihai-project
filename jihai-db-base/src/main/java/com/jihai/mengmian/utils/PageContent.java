package com.jihai.mengmian.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevinchen on 2017/8/15.
 */
public class PageContent<T> {

    private long total;

    private List<T> content = new ArrayList<T>();

    private int page;

    private int size;

    public PageContent() {
    }

    public PageContent(long total, List<T> content, int page, int size) {
        this.total = total;
        this.content = content;
        this.page = page;
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PageContent(Page<T> page) {
        this.content = page.getContent();
        this.page = page.getNumber();
        this.size = page.getSize();
        this.total = page.getTotalElements();
    }

    public Page<T> convertPage(){
        return new PageImpl<T>(content,new PageRequest(page,size),this.total);
    }


}
