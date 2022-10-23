package com.jindo.core.cheatsheet;

/**
 * @author ManhKM on 9/1/2022
 * @project java-oop
 */
public class StringPlusString {

    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd123";
        String c = "abcd" + "123";      // StringPool kiểm tra đã có abcd123 rồi -> trỏ cái c vào StringPool đó
        String d = a + 123;
        String e = "abcd" + 123 +"";
        String cObject = new String(c);

        System.out.println(b == c);
        System.out.println(b == cObject);
        System.out.println(b == d); //false
        System.out.println(b == e);
    }

}
