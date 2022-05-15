package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ManhKM on 2/7/2022
 * Thực hành việc làm phẳng một list các list.
 * @project introduction-java-variable-function-main
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(4,5,6,7,5,4,6,7,8,9);

        List<List<Integer>> listData3 = Arrays.asList(list1, list2);
        System.out.println("Dữ liệu nếu gộp 2 list: ");
        System.out.println(listData3);

        System.out.println("Dữ liệu sau khi xử lý FlatMap: ");
        System.out.println(flatMapMethod(listData3));

        System.out.println("Dữ liệu sau khi xử lý distinct: ");
        distinctMethod(flatMapMethod(listData3));
    }

    private static void distinctMethod(List<Integer> listData) {
        System.out.println(listData.stream()
                .distinct()
                .collect(Collectors.toList())
        );
    }

    /**
     * Method Flatmap -> làm phẳng một List các list ra.
     * Dùng cho các mục đích logic khác nếu có.
     * @param list3
     */
    private static List<Integer> flatMapMethod(List<List<Integer>> list3) {
        List<Integer> list4 = list3.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return list4;
    }
}
