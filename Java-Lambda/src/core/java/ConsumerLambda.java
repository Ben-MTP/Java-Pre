package core.java;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author ManhKM on 4/11/2022
 * @project Java-Lambda
 */
public class ConsumerLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        numbers.add(100);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}
