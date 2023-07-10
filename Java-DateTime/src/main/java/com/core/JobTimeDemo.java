package com.core;

public class JobTimeDemo {

    private static int sum() {
        int sum = 0;
        for (int i = 0; i <= 10_000; i++) {
            sum += i;
            System.out.print("   >>> execute sum[" + i + "]");
        }
        return sum;
    }

    private static void doJob(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(">>> execute doJob[" + i + "]");
            sum();
        }
    }

    public static void main(String[] args) {
        long millis1 = System.currentTimeMillis();
        doJob(100_000_000);

        long millis2 = System.currentTimeMillis();

        long distance = millis2 - millis1;

        System.out.println("Distance time in milli second: " + distance);
    }

}
