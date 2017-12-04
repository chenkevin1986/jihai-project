package com.jihai.mengmian.request;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zohar on 17-1-16.
 */
public class CycleGenerator {
    private static final long aDayMillisecond = 1000L * 60 * 60 * 24;
    private long startTimeStamp;
    private int value;

    private List<String> list = new ArrayList<>();
    private int index = 0;

    /**
     * @param startTimeStamp 开始时间戳
     * @param value          时间段
     */
    public CycleGenerator(long startTimeStamp, int value) {
        this.startTimeStamp = startTimeStamp;
        this.value = value;

        init();
    }

    private void init() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < value; i++) {
            String datetimeString = simpleDateFormat.format(new Date(startTimeStamp + i * aDayMillisecond));
            list.add(datetimeString);
        }
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public String next() {
        String result = list.get(index);
        index++;
        return result;
    }
}
