package com.jihai.mengmian.entity;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zohar on 17-1-20.
 */

/**
 * Spring Data Jpa Page 默认的第一页是 0
 * 适配成第一页是 1
 */
public class GPageRequest extends PageRequest {

    public GPageRequest(int page, int size, Sort sort) {
        super(page, size, sort);
    }

    public static GPageRequest build(int page, int size, List<Sort.Order> orders) {
        Sort sort = new Sort(orders);
        return new GPageRequest(page - 1, size, sort);
    }

    /**
     * 构造查询条件
     *
     * @param page    第几页
     * @param size    每页大小
     * @param orderBy 分页参数 如:name desc,id asc
     * @return
     */
    public static GPageRequest build(int page, int size, String orderBy) {
        String[] orderPairs = orderBy.split(",");
        List<Sort.Order> orders = new ArrayList<>();
        for (String order : orderPairs) {
            String[] orderPair = order.split(" ");
            String property = orderPair[0];
            String directionString = orderPair.length > 1 ? orderPair[1] : "ASC";
            Sort.Direction direction = Sort.Direction.fromStringOrNull(directionString);
            Sort.Order order1 = new Sort.Order(direction, property);
            orders.add(order1);
        }
        Sort sort = new Sort(orders);
        return new GPageRequest(page - 1, size, sort);
    }
}
