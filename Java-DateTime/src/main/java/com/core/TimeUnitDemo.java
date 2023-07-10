package com.core;

import java.util.concurrent.TimeUnit;

public class TimeUnitDemo {
    public static void main(String[] args) {
        int minute = 5;
        int millisecond = minute * 60 * 1_000;

        // Sử dụng TimeUnit;
        long millisecond2 = TimeUnit.MINUTES.toMillis(minute);

        System.out.println("Case 1: " + millisecond);
        System.out.println("Case 2: " + millisecond2);

        // Chuyển đổi nano giây:
        long nanos = TimeUnit.MINUTES.toNanos(minute);
        System.out.println("Nanos: " + nanos);

        long hours = TimeUnit.MINUTES.toHours(minute);
        System.out.println("Hours: " + hours);
    }
}
