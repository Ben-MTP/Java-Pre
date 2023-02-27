package com.core.gpcoder.stream.terminal;

import java.util.stream.Stream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class ForEachStreamExample {

  public static void main(String[] args) {
    Stream.iterate(1, count -> count + 1)
        .filter(number -> number % 3 == 0)
        .limit(6)
        .forEach(System.out::println);
  }

}
