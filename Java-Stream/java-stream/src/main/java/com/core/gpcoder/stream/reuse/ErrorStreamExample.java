package com.core.gpcoder.stream.reuse;

import java.util.stream.Stream;

/**
 * @author ManhKM on 11/1/2022
 * @project java-stream
 */
public class ErrorStreamExample {

  public static void main(String[] args) {
    Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript")
        .filter(s -> s.startsWith("J"));

    stream.anyMatch(s -> true);
    stream.noneMatch(
        s -> true);  //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)

  }
}
