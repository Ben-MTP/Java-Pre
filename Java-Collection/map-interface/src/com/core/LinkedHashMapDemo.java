package com.core;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ManhKM on 8/13/2022
 * @project map-interface
 * -----
 * Additional Feature:
 * quick insertion, search, deletion.
 * -LinkedHashMap-
 * cung cấp một nơi mà các key-value sẽ được truyền vào theo thứ tự
 * Nếu xuất dữ liệu trong file, hoặc dùng Map để lưu giá trị Query từ Database.
 * Dùng Linked sẽ lưu được vị trí của các phần từ trong file.
 */
public class LinkedHashMapDemo {

  public static void main(String[] args) {
    Map<String, Integer> map = new LinkedHashMap<>();

    map.put("value1", 100);
    map.put("value2", 200);
    map.put("value3", 300);
    map.put("value4", 400);

    for (Map.Entry<String, Integer> e : map.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
  }

}
