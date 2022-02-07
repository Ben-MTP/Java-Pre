package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ManhKM on 2/7/2022
 * @logic
 *      1. method sort(list)
 *      2. method với lambda -> list.sort((a,b) -> a - b);
 * @project introduction-java-variable-function-main
 */
public class SortElementDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,4,10,7,48,29);

        //Method1(list); //OK
        //Method2(list);
        Method3(list);
    }

    /**
     * Sắp xếp theo giá trị giảm dần.
     * @param list
     */
    private static void Method3(List<Integer> list) {
        list.sort((a,b) -> b - a);
        System.out.println(list);
    }

    /**
     * Sort using lambda expression
     * @param list
     */
    private static void Method2(List<Integer> list) {
        list.sort((a,b) -> a - b);
        System.out.println(list);
    }

    private static void Method1(List<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }
}
