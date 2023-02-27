package com.core.gpcoder.stream.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class SortedStreamExample {

  public static void main(String[] args) {
    List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

    data.stream()
        .sorted()
        .forEach(System.out::println);
    System.out.println("-------------");
    data.stream()
        .sorted((s1, s2) -> s1.length() - s2.length())
        .forEach(System.out::println);
  }
}
