package com.core.gpcoder.stream.terminal;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class MatchStreamExample {

  public static void main(String[] args) {
    List<String> data = Arrays
        .asList("Java", "C#", "C++", "PHP", "Javascript");
    boolean result = data.stream()
        .anyMatch((s) -> s.equalsIgnoreCase("Java"));
    System.out.println(result);
  }
}
