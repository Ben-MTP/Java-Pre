package com.core.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ManhKM on 7/22/2022
 * @project java-stream
 * -----
 * Java|Stream|filter
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Khánh", "ManhKM", "Dung", "Mai");

        names.stream().filter(s -> s.startsWith("M"))
                .forEach(System.out::println);

        Stream<String> stream = names.stream();
        stream.filter(s -> s.startsWith("K")).distinct().forEach(System.out::println);
    }
}
