package com.core.stream.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Collection
 */
public class ConvertToStreamExample {
    public static void streamFromArray(){
        String[] languages = {"Java", "JavaScript", "PHP"};

        /**
         * Tạo Stream sử dụng Arrays.stream
         */
        Stream<String> testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.println(x));

        Stream<String> testStream2 = Stream.of(languages);
        testStream2.forEach(x -> System.out.println(x));
    }

    public static void streamFromCollection(){
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C++");
        items.add("C#");
        items.add("JavaScript");
        items.stream().forEach(item -> System.out.println(item));

    }

    public static void streamUsingGenerate(){
//        Stream<String> stream = Stream.generate();
    }

    public static void main(String[] args) {
        streamFromCollection();
    }
}
