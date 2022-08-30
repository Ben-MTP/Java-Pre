package com.jindo.core.java3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author ManhKM on 8/30/2022
 * @project java-oop
 */
public class DateDemo {

    public static void main(String[] args) {
        // Format Date:
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss");
        System.out.println(format.format(d));

        // Convert chuỗi thành Date:
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format1.parse("30/04/1996");
            System.out.printf("Số mili giây: %d\n", date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Using GregorianCalendar:
        GregorianCalendar d1 = new GregorianCalendar(2022, 03, 40);
        System.out.println(d1.getActualMaximum(Calendar.DAY_OF_YEAR));
        System.out.println(d1.getActualMaximum(Calendar.DAY_OF_MONTH));

    }

}
