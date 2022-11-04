package com.core.gpcoder.intro;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class PrimitiveStreamExample {

  public static void main(String[] args) {
    IntStream.range(1, 4).forEach(System.out::print);

    IntStream.of(1, 2, 3).forEach(System.out::print);

    DoubleStream.of(1, 2, 3, 4).forEach(System.out::print);

    LongStream.range(1, 4).forEach(System.out::print);

    LongStream.of(1, 2, 3).forEach(System.out::print);

  }
}
