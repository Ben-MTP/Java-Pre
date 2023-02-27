package com.core.gpcoder.stream.intro;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream ----- stream(): trả về một stream được thực hiện một cách tuần tự
 * parallelStream(): Trả về một Stream song song, các xử lý sau đó sẽ thực hiện song song
 */
public class StreamExample {

  List<Integer> numbers = Arrays.asList(7, 6, 5, 4, 2, 4, 6, 7);

  public void withoutStream() {
    long count = 0;
    for (Integer item : numbers) {
      if (item % 2 == 0) {
        count++;
      }
    }
    System.out.printf("[withoutStream] There are %d element that are even", count);
  }

  public void withStream() {
    long count = numbers.stream().filter(
        num -> num % 2 == 0
    ).count();
    System.out.printf("[withStream] There are %d element that are even", count);
  }

}
