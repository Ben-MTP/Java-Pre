package com.core.stream.intro;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Collection
 */
public class StreamExample {
    List<Integer> numbers = Arrays.asList(2,3,4,1,2,4,5,3);

    /**
     * Bài toán liệt kê tổng số chẵn trong mảng cho trước:
     * count
     * Thực hiện code normal.
     */
    public void withoutStream(){
        long count = 0;
        for(Integer number : numbers){
            if(number % 2 == 0){
                count++;
            }
        }
        System.out.printf("There are %d elements that are even", count);
    }

    /**
     * Triển khai với dạng Lambda
     * chuyển về stream -> count().
     */
    public void withStream(){
        long count = numbers.stream()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.printf("There are %d elements that are even", count);
    }
}
