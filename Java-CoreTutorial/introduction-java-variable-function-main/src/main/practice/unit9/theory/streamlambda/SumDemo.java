package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 2/7/2022
 * @logic
 *      Tính tổng các giá trị trong List
 *      Bằng cách cộng tất cả các giá trị lại
 *
 * @project introduction-java-variable-function-main
 */
public class SumDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,4,6,7);

        sumTotalValue(list);
    }

    private static void sumTotalValue(List<Integer> list) {
        Integer sum = list.stream()
                .reduce((a, b) -> a + b)
                .get();
        System.out.println("Tổng giá trị trong list: " + list + ": -> " + sum);
    }
}
