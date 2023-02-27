package com.core.gpcoder.stream.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class ParallelStreamExample {

  public static void main(String[] args) {
    List<String> values = createDummyData();

    long startTime = System.nanoTime();
    long count = values.parallelStream().sorted().count();
    System.out.println("Counter data of stream: " + count);

    System.out.println(String.format("parallel sort took: %d ms",
        TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime)));
  }

  private static List<String> createDummyData() {
    int max = 1000_000;
    List<String> values = new ArrayList<>(max);
    for (int i = 0; i < max; i++) {
      UUID uuid = UUID.randomUUID();
      values.add(uuid.toString());
    }
    return values;
  }
}
