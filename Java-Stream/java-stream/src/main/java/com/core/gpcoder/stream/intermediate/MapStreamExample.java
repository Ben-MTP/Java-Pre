package com.core.gpcoder.stream.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class MapStreamExample {

  public static void main(String[] args) {
    List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");

    data.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
