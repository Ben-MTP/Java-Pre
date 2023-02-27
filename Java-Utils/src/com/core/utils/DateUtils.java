package com.core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ManhKM on 6/20/2022
 * @project Java-Utils
 */
public class DateUtils {

    public static String getStringDateWithFormat(Date inputDate, String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(inputDate);
    }

    public static void main(String[] args) {
        //202206171
        Date today = new Date();
        System.out.println(getStringDateWithFormat(today, "YYYYMMDD"));
    }
}
