package com.jihai.mengmian.request;

import java.util.Date;

/**
 * Created by zohar on 17-1-16.
 */

/**
 * 请求带有时间轴参数的请求参数枚举
 */
public enum Cycle {
    days7("days7", 7, "DAYS"),

    days30("days30", 30, "DAYS");

    private static final long aDayMillisecond = 1000L * 60 * 60 * 24;
    private String name;
    private int value;
    private String unit;

    Cycle(String name, int value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    /**
     * 获取时间段
     *
     * @return
     */
    public int getValue() {
        return value;
    }

    public long getStartTimeStamp(Date date) {
        long endTimeStamp = date.getTime();
        long startTimeStamp = endTimeStamp - (value - 1) * aDayMillisecond; // 时间会多出一天
        return startTimeStamp;
    }

    public Date getStartDate(Date date) {
        return new Date(getStartTimeStamp(date));
    }

    public long getEndTimeStamp(Date date) {
        return date.getTime();
    }

    public Date getEndDate(Date date) {
        return new Date(getEndTimeStamp(date));
    }
}
