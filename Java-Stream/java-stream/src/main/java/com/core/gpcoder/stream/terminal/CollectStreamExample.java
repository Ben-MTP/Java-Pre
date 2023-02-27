package com.core.gpcoder.stream.terminal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class CollectStreamExample {

  public static void main(String[] args) {
    Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
    List<String> languages = stream.collect(Collectors.toList());
    System.out.println(languages);
  }
}
