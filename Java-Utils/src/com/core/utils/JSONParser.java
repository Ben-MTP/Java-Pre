package com.core.utils;

import com.core.entity.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author ManhKM on 6/21/2022
 * @project Java-Utils
 */
public class JSONParser {
    private static final GsonBuilder gsonBuilder = new GsonBuilder();
    private static final Gson gson = gsonBuilder.create();

    public static Object fromJson(String o, Class<?> c) {
        try {
            return gson.fromJson(o, c);
        } catch (Exception e) {
            return null;
        }
    }

    public static String toJson(Object o) {
        try {
            return gson.toJson(o);
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
//        Employee employee = new Employee("ManhKM", 18, "ThaiBinh");
//        System.out.println(toJson(employee));

        String dataJson = "{\"name\":\"TrangTT\",\"age\":18,\"address\":\"HaNam\"}";
        System.out.println(fromJson(dataJson, Employee.class).toString());
    }
}
