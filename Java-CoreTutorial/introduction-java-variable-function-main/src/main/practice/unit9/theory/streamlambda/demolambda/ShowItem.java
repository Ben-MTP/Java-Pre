package main.practice.unit9.theory.streamlambda.demolambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/24/2022
 * @project introduction-java-variable-function-main
 */
public class ShowItem {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        numbers.add(7);
        numbers.add(8);

        // list all item in list:
        System.out.println("Giá trị trong List: ");
        numbers.forEach((n) -> {
            System.out.print(n +", ");
        });
    }
}
