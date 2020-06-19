package org.linlinjava.litemall.core.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 日期格式化工具类
 */
public class DateTimeUtil {

    public static final String STRING_FORMART1 = "yyyy-MM-dd HH:mm:ss";
    public static final String STRING_FORMART2 = "yyyyMMdd";
    public static final String STRING_FORMART3 = "yyyy-MM-dd";

    private static final Logger LOG = LoggerFactory.getLogger(DateTimeUtil.class);

    /**
     * 格式 yyyy年MM月dd日 HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String getDateTimeDisplayString(LocalDateTime dateTime) {
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
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
}
