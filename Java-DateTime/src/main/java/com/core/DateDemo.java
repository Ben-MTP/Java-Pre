package com.core;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date();

        long millis = System.currentTimeMillis();
        Date date2 = new Date(millis);


    }
}
