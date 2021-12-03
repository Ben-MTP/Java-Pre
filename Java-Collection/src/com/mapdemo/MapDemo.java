package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 12/3/2021
 * @project Java-Collection
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> mapDemo = new HashMap<Integer, String>();
        mapDemo.put(1, "Khổng Minh Mạnh");
        mapDemo.put(2, "Lê Việt Thắng");
        mapDemo.put(3, "Vũ Trung Hiếu");

        System.out.println("List value in Map: ");
        for (Map.Entry m: mapDemo.entrySet()) {
            System.out.println(m.getKey() +" - "+ m.getValue());
        }

    }
}
