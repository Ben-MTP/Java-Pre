package main.practice.unit9.theory.streamlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class RemoveDemo {
    public static void main(String[] args) {
        //List<Integer> listData = Arrays.asList(11,12,13,14,15,16);
        List<Integer> listData = new ArrayList<>();
        listData.add(11);
        listData.add(12);
        listData.add(13);
        listData.add(14);
        listData.add(15);
        listData.add(16);

        //removeNormal(listData);
        //removeIfLambda(listData);
        listData.removeIf(p -> p > 15);
        System.out.println(listData);
    }

    private static void removeIfLambda(List<Integer> listData) {
        listData.removeIf(p -> p > 15);
        System.out.println(listData);
    }

    /**
     * @logic
     *      1. i -> index thay đổi khi remove phần tử.
     *      2. Remove từ cuối lên đầu.
     * @param listData
     */
    private static void removeNormal(List<Integer> listData) {
        int maxLength = listData.size();
        for (int i = maxLength - 1; i > 0; i--){
            Integer element = listData.get(i);
            if(element > 19){
                listData.remove(i);
            }
        }
        System.out.println(listData);
    }
}
