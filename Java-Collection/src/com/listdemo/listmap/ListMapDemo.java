package com.listdemo.listmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ManhKM on 12/3/2021
 * @project Java-Collection
 */
public class ListMapDemo {
    public static void main(String[] args) {
        List<Map<String, Object>> data = new ArrayList<>();

        int numberOfList = 10;
        for (int i = 0; i < numberOfList; i++){
            Map<String, Object> row = new LinkedHashMap<>();

            row.put("NAME", "name_"+i);
            row.put("ADDRESS", "address_"+i);
            row.put("AGE", "age_"+i);

            data.add(row);
        }

        for (Map<String, Object> m: data) {
            System.out.println(m.get("NAME") + " - " +m.get("ADDRESS") + " - " + m.get("AGE"));
        }
    }
}
