package com.demo;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 * @475
 */
public class StringBuilderUnimmutable {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("manh");
        stringBuilder.append("-km");
        System.out.println("Name: " + stringBuilder);
    }
}
