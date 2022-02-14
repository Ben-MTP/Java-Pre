package com.demo;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 * @476
 * @478
 * Khi chạy qua các biến thì địa chỉ của String đã thay đổi.
 */
public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "abc";
        s1 = s1 + "def";
        System.out.println("s1");
    }
}
