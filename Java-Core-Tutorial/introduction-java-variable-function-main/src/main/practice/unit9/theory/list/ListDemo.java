package main.practice.unit9.theory.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/1/2022
 * @project introduction-java-variable-function-main
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> listData = new ArrayList<>();
        /**
         * Khởi tạo và thêm giá trị cho list:
         */
        listData.add(10);
        listData.add(11);
        listData.add(12);
        listData.add(13);
        listData.add(14);
        listData.add(15);

        showData(listData);
        // removeData(listData);
        System.out.println();
        showData(listData);
    }

    private static void removeData(List<Integer> listData) {
        listData.removeIf(p -> p >= 13);
    }

    private static void showData(List<Integer> listData) {
        for (Integer i: listData) {
            System.out.print(i + ", ");
        }
    }
}
