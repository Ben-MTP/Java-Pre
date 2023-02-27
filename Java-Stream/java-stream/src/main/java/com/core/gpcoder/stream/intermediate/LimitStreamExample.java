package com.core.gpcoder.stream.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class LimitStreamExample {

  public static void main(String[] args) {
    List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
    data.stream()
        .skip(1)
        .limit(3)
        .forEach(System.out::print);
  }
}
