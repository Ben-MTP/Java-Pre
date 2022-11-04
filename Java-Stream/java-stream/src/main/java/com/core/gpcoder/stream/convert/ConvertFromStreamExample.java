package com.core.gpcoder.stream.intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class ConvertFromStreamExample {

  public static void getCollectionUsingStreamCollection() {
    Stream<String> stream = Stream.of("A", "B", "C");
    List<String> languages = stream.collect(Collectors.toList());
    System.out.println(languages);
  }

  public static void main(String[] args) {
    System.out.println("Get Collection using Stream Collection: ");
    getCollectionUsingStreamCollection();

    System.out.println("Get Array Using Stream to Array: ");
    getArrayUsingStreamToArray();
  }

  public static void getArrayUsingStreamToArray() {
    Stream<String> stream = Stream.of("A", "B", "C");
    String[] languages = stream.toArray(String[]::new);
    System.out.println(Arrays.toString(languages));
  }
}
