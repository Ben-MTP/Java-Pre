package com.core.stream.intro;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Collection
 */
public class StreamMain {
    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withoutStream();
        System.out.println();
        streamExample.withStream();
    }
}
