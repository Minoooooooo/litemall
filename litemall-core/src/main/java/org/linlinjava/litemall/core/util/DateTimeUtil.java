package org.linlinjava.litemall.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期格式化工具类
 */
public class DateTimeUtil {

    public static final String STRING_FORMART1 = "yyyy-MM-dd HH:mm:ss";
    public static final String STRING_FORMART2 = "yyyy年MM月dd日 HH:mm:ss";
    public static final String STRING_FORMART3 = "yyyy-MM-dd";
    public static final String STRING_FORMART4 = "MM-dd";

    private static final Logger LOG = LoggerFactory.getLogger(DateTimeUtil.class);

    /**
     * 格式 yyyy年MM月dd日 HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String getDateTimeDisplayString(LocalDateTime dateTime) {
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(STRING_FORMART2);
        String strDate2 = dtf2.format(dateTime);

        return strDate2;
    }


    /**
     * 日期转字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 字符串转日期
     *
     * @param dateString
     * @param format
     * @return
     */
    public static Date stringToDate(String dateString, String format) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            LOG.error("format error:{}", e);
        }
        return date;
    }

    /**
     * 获得当天零时零分零秒
     *
     * @return
     */
    public static Date getInitDate() {
        Date time = new Date();
        Date parseDate = null;
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        SimpleDateFormat simp2 = new SimpleDateFormat(STRING_FORMART1);
        try {
            parseDate = simp2.parse(simp.format(time));
        } catch (ParseException e) {
            LOG.error("format error:{}" + e);
        }
        return parseDate;
    }

    /**
     * 获取过去第past天的日期
     *
     * @param past
     * @return
     */
    public static Date getPastDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        return calendar.getTime();
    }

    /**
     * 获取未来第past天的日期
     *
     * @param past
     * @return
     */
    public static Date getFetureDate(int past) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + past);
        return calendar.getTime();
    }

    /**
     * 获取参数日期是周几
     *
     * @param date
     * @return
     */
    public static String getWeek(Date date) {
        String[] weeks = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (week_index < 0) {
            week_index = 0;
        }
        return weeks[week_index];
    }

    /**
     * 获取今年年份
     *
     * @return
     */
    public static int getYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }

}
