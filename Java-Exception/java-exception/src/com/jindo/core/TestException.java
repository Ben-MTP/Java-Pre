package com.jindo.core;

/**
 * @author ManhKM on 5/15/2022
 * @project java-exception
 */
public class TestException {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            System.out.println(x/y);
        } catch (ArithmeticException e){
            System.out.println("Không thể thực hiện phép chia cho 0");
        }
        System.out.println("-----> Exception in Java");
    }
}
