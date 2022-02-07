package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class MaxMinDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,7,7,7);
        FindMaxValue(list);
        FindMinValue(list);
    }

    private static void FindMinValue(List<Integer> list) {
        Optional<Integer> min = list.stream().min(Comparator.comparingInt(a -> a));
        System.out.println("Min value of list: " + min.get());
    }

    private static void FindMaxValue(List<Integer> list) {
        Optional<Integer> max = list.stream().max(Comparator.comparingInt(a -> a));
        System.out.println("Max value of list: " + max.get());
    }
}
