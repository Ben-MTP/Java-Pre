package com.listdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 12/3/2021
 * @project Java-Collection
 * Project List-Collection
 *      + CRUD in List
 *      + SORT in List
 *      +
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Khổng Minh Mạnh");
        stringList.add("Lê Việt Thắng");
        stringList.add("Vũ Trung Hiếu");

        for (String i: stringList) {
            System.out.println(i);
        }
    }
}
