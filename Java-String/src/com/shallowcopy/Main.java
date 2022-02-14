package com.shallowcopy;

/**
 * @author ManhKM on 2/14/2022
 * @project Java-String
 * address: o1 -> 475
 * address: o2 -> 480
 * o2 = o1 -> address o2 -> trỏ sang địa chỉ của o1.
 *
 * Reference document:
 * https://tunghuynh.net/programer/java/1957/java-phan-6-su-khac-biet-giua-shallow-copy-voi-deep-copy-va-cach-tranh-loi-tiem-an/
 */
public class Main {
    public static void main(String[] args) {
        Obj o1 = new Obj("123");
        Obj o2 = new Obj("abc");
        System.out.println("Init: " + o1 + " | " + o2);

        o2 = o1;
        System.out.println("After assign: " + o1 + " | " + o2);
        o2.setContent("456");
        System.out.println("After set o2: " + o1 + " | " + o2);
        o1.setContent("789");
        System.out.println("After set o1: " + o1 + " | " + o2);
    }
}
