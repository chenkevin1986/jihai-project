package com.jihai.mengmian.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by fju on 2017/8/31.
 * 时间工具类，方便获取Date中的年月日
 */
public class TimeUtil {

    public static String formatyyyy = "yyyy";
    public static String formatyyyyMM = "yyyyMM";
    public static String formatyyyyMMdd = "yyyyMMdd";
    public static String formatyyyyMMddHH = "yyyyMMddHH";

    /**
     * 字符串转日期
     * 如果转换失败,那么会设定为当前日期
     * @param str
     * @param formatStr
     * @return
     */
    public static Date strToDate(String str, String formatStr) {
        SimpleDateFormat format = new SimpleDateFormat(formatStr);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            date = new Date();
        }
        return date;
    }


    /**
     * 设置calendar
     * @param settingDate
     * @return
     */
    public static Calendar getCalendar(Date settingDate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(settingDate);
        return calendar;
    }

    public static int getYear(Date date){
        return getCalendar(date).get(Calendar.YEAR);
    }

    /**
     * 获取月份,不需要+1
     * @param date
     * @return
     */
    public static int getMonth(Date date){
        return getCalendar(date).get(Calendar.MONTH)+1;
    }

    public static int getDay(Date date){
        return getCalendar(date).get(Calendar.DAY_OF_MONTH);
    }

    public static int getHour(Date date){
        return getCalendar(date).get(Calendar.HOUR_OF_DAY);
    }


    public static boolean isSameDay(Date date1, Date date2) {
        Calendar calDateA = Calendar.getInstance();
        calDateA.setTime(date1);

        Calendar calDateB = Calendar.getInstance();
        calDateB.setTime(date2);

        return calDateA.get(Calendar.YEAR) == calDateB.get(Calendar.YEAR)
                && calDateA.get(Calendar.MONTH) == calDateB.get(Calendar.MONTH)
                && calDateA.get(Calendar.DAY_OF_MONTH) == calDateB
                .get(Calendar.DAY_OF_MONTH);
    }
}
