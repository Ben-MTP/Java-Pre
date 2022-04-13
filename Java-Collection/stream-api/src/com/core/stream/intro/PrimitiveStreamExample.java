package com.core.stream.intro;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Thực hiện code với các Primitive Data trong Java
 *      + IntStream
 *      + DoubleStream
 *      + LongStream
 *      Các method hỗ trợ: range, of...
 * @author ManhKM on 4/12/2022
 * @project Java-Collection
 */
public class PrimitiveStreamExample {

    public static void main(String[] args) {
        IntStream.range(1,4).forEach(System.out::print);

        IntStream.of(1,2,3,4).forEach(System.out::print);

        DoubleStream.of(1,2,3,4,5).forEach(System.out::print);

        LongStream.range(1,4).forEach(System.out::print);

        LongStream.of(1,2,3,4,5,6).forEach(System.out::print);
    }
}
