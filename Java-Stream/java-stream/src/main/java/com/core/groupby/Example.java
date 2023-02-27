package com.core.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ManhKM on 7/22/2022
 * @project java-stream
 */
public class Example {
    public static void main(String[] args) {
        List<Student> names = Arrays.asList(
                new Student("ManhKM", "VN"),
                new Student("Trang", "VN"),
                new Student("Hieu", "US"),
                new Student("Thang", "VN"),
                new Student("Luong", "VN")
        );

        Map<String, List<Student>> result = names.stream()
                .collect(Collectors.groupingBy(Student::getCountry));

        result.entrySet().stream()
                .forEach(r -> System.out.println("- " + r.getKey() + "\n" + r.getValue()));
    }
}
