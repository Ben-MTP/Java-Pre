package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class DistinctDemo {
    public static void main(String[] args) {
        List list = Arrays.asList(4,4,5,6,76,87,6,5,4,3,3,3,2,3,3,3,2,2,22,2);
        System.out.println(list.stream()
                .distinct()
                .collect(Collectors.toList())
        );
    }
}
