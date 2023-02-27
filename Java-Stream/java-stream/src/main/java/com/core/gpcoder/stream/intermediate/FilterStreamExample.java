package com.core.gpcoder.stream.intermediate;

import java.util.stream.Stream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class FilterStreamExample {

  public static void main(String[] args) {

    Stream.iterate(1, count -> count + 1)
        .filter(number -> number % 3 == 0)
        .limit(10)
        .forEach(System.out::println);
  }
}
