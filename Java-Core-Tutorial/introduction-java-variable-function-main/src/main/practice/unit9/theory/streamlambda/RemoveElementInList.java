package main.practice.unit9.theory.streamlambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class RemoveElementInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        list.removeIf(p -> p > 2);
        System.out.println(list);
    }
}
