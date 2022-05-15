package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ManhKM on 2/7/2022
 * Logic: Lọc ra các phần từ lớn hơn 5
 * @project introduction-java-variable-function-main
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,11,10,9, 15, 16, 17, 18);
        int maximumValue = 10;
        //UseForMethod(list);
        //UseFilterMethod(list);
        //ListElementBigger15(list);
        ListElementBiggerN(list, maximumValue);
    }

    /**
     * Tìm các phần từ lớn hơn N cho trước trong List<Integer>
     * @param list
     * @param maximumValue
     */
    private static void ListElementBiggerN(List<Integer> list, int maximumValue) {
        List<Integer> filters = list.stream()
                .filter(i -> i > maximumValue)
                .collect(Collectors.toList());
        System.out.println("List các giá trị lớn hơn "+maximumValue+": ");
        System.out.println(filters);
    }

    private static void ListElementBigger15(List<Integer> list) {
        List<Integer> filters = list.stream()
                .filter(i -> i > 15)
                .collect(Collectors.toList());
        System.out.println("List các giá trị lớn hơn 15: ");
        System.out.println(filters);
    }

    /**
     * Tìm ra các phần từ có giá trị lớn hơn 5 trong list<Integer>
     * @param list
     */
    private static void UseFilterMethod(List<Integer> list) {
        List<Integer> filters = list.stream()
                .filter(i -> i > 5)
                .collect(Collectors.toList());
        System.out.println("List các giá trị lớn hơn 5: ");
        System.out.println(filters);
    }

    private static void UseForMethod(List<Integer> list) {

    }
}
