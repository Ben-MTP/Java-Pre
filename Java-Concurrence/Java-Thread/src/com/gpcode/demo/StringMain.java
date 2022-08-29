package com.gpcode.demo;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 */
public class StringMain {
    public static void main(String[] args) {
        showResult(9);
    }

    private static void showResult(int i) {
        System.out.println(Integer.toString((int) (Math.pow(10, i) - 1)));
    }

}
