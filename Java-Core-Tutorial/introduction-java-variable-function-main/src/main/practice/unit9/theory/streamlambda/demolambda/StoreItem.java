package main.practice.unit9.theory.streamlambda.demolambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author ManhKM on 2/24/2022
 * @project introduction-java-variable-function-main
 */
public class StoreItem {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(14);
        numbers.add(19);
        numbers.add(11);
        numbers.add(92);
        numbers.add(1);

        Consumer<Integer> consumer = (n) -> {
            System.out.print(n + ", ");
        };

        numbers.forEach(consumer);
    }
}
