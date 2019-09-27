package com.mmall.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * @author jason
 * @2019/9/27
 */

public class DateTimeUtil {

    //joda-time

    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    //Str -> Date
    public static Date strToDate(String dataTimeStr, String formatStr){
        DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormat.parseDateTime(dataTimeStr);
        return dateTime.toDate();
    }

    //Date -> Str
    public static String dateToStr(Date date, String formatStr){
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }

    //Str -> Date
    public static Date strToDate(String dataTimeStr){
        DateTimeFormatter dateTimeFormat = DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTime = dateTimeFormat.parseDateTime(dataTimeStr);
        return dateTime.toDate();
    }

    //Date -> Str
    public static String dateToStr(Date date){
        if (date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }

    public static void main(String[] args) {
        System.out.println(DateTimeUtil.dateToStr( new Date(), "yyyy-MM-dd"));
        System.out.println(DateTimeUtil.strToDate("2019-01-09", "yyyy-MM-dd"));
    }
}
