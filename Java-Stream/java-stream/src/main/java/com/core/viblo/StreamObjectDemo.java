package com.core.viblo;

import com.core.viblo.entity.Employee;
import java.util.stream.Stream;

/**
 * @author ManhKM on 11/26/2022
 * @project java-stream
 */
public class StreamObjectDemo {

  public static void main(String[] args) {

    Stream<Employee> stream = Stream.of(
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19),
        new Employee(1L, "manhkm", "thai-binh", 19));

    // Print the stream:
    stream.forEach(s -> System.out.println(s.toString()));
  }
}
