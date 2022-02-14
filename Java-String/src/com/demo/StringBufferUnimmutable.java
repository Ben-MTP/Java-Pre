package com.demo;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 */
public class StringBufferUnimmutable {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("thai");
        stringBuffer.append("-binh");
        System.out.println("Address: " + stringBuffer);
    }
}
