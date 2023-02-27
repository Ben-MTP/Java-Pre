package com.core.viblo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ManhKM on 11/26/2022
 * @project java-stream
 * <p>
 * Tài liệu tham khảo: Streams in Java 8: https://viblo.asia/p/streams-in-java-8-dWrvwd5gRw38
 */
public class StreamListDemo {

  public static void main(String[] args) {

    List<String> items = new ArrayList<>();

    items.add("one");
    items.add("two");
    items.add("three");
    items.add("four");
    items.add("five");

    Stream<String> stream = items.stream(); // Convert từ List thành Stream

    System.out.println("Danh sách phần từ trong Stream: ");
    stream.forEach(s -> System.out.println(s));
  }

}
