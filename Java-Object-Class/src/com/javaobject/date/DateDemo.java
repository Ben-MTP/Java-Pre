package com.javaobject.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ManhKM on 3/7/2022
 * @project Java-Object
 */
public class DateDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        System.out.println(simpleDateFormat.getCalendar().getTime());

        System.out.println("new Date: " + new Date());
    }
}
