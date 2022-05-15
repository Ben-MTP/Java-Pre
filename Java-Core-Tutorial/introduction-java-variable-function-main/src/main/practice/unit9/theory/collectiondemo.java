package main.practice.unit9.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/1/2022
 * @project introduction-java-variable-function-main
 */
public class collectiondemo {
    public static void main(String[] args) {
        List<Integer> listData = new ArrayList<>();
        listData.add(11);
        listData.add(55);
        listData.add(22);
        listData.add(33);
        listData.add(99);

        // show all listData:
        // lookup(listData);
        showInfo(listData);
    }

    private static void showInfo(List<Integer> listData) {
        for (Integer item: listData) {
            System.out.println(item);
        }
    }

    private static List<Integer> lookup(List<Integer> dataList) {

        return null;
    }
}
