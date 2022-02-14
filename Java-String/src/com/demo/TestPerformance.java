package com.demo;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 */
public class TestPerformance {
    public static void main(String[] args) {
        /**
         * Làm việc với String.
         */
        String str ="";
        long time = System.currentTimeMillis();
        for (int i = 0 ; i < 100000; i++){
            str+="add string ";
        }
        System.out.println("String: " + (System.currentTimeMillis() - time) + " ms");

        /**
         * Làm việc với StringBuilder:
         */
        time = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < 100000; i++){
            stringBuilder.append("append string");
        }
        System.out.println("StringBuilder 100K: "+(System.currentTimeMillis() - time) + " ms");

        /**
         * Làm việc với StringBuffer:
         */
        time = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0 ; i < 100000; i++){
            stringBuffer.append("append string ");
        }
        System.out.println("StringBuffer 100K: "+(System.currentTimeMillis() - time) + " ms");

        time = System.currentTimeMillis();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0 ; i < 1000000; i++){
            stringBuilder1.append("append string");
        }
        System.out.println("StringBuilder 1M: "+(System.currentTimeMillis() - time) + " ms");

        time = System.currentTimeMillis();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0 ; i < 1000000; i++){
            stringBuffer1.append("append string ");
        }
        System.out.println("StringBuffer 1M: "+(System.currentTimeMillis() - time) + " ms");

        /**
         * String: 74492 ms
         * StringBuilder 100K: 4 ms
         * StringBuffer 100K: 6 ms
         * StringBuilder 1M: 27 ms
         * StringBuffer 1M: 27 ms
         */
    }
}
