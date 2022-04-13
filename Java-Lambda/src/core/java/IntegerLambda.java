package core.java;

import java.util.ArrayList;

/**
 * @author ManhKM on 4/11/2022
 * @project Java-Lambda
 */
public class IntegerLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.add(12);
        numbers.forEach(
                (n) -> {
                    System.out.println(n);
                }
        );
    }
}
