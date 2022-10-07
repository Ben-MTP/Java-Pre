package com.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 10/7/2022
 * @project java-list
 */
public class ListString {

    public static void main(String[] args) {
        List<String> listContent = new ArrayList<>();
        String listData = "khong;minh;manh;neo;vn;hanoi;thaibinh;vietnam;dongxuan;donghung";
        String arr[] = listData.split(";");
        for (String string : arr){
            listContent.add(string);
        }

        System.out.println("Data of listContent: ");
        for (String item: listContent) {
            System.out.println(item);
        }
    }
}
