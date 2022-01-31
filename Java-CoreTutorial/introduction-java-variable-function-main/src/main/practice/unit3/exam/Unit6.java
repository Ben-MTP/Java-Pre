package main.practice.unit3.exam;

import java.util.*;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Cho list gồm N xâu kí tự
 * Hãy tìm ra xâu kí tự bị lặp trong list
 */
public class Unit6 {
    public static void main(String[] args) {
        List<Integer> listValue = Arrays.asList(11,11,11,32,32,32,32,32,32,32,32,32,32,32,43,54,65,43,231,
                43,54,32,21,432,43,54,65,6757,6,56454,54,2332);

        /**
         * Sử dụng method add trong Set
         * Nếu add -> true -> phần tử đó chưa tồn tại
         * Nếu add -> false -> phần từ đó đã tồn tại.
         */

        System.out.println(lookup(listValue));
    }

    private static Set<Integer> lookup(List<Integer> listValue) {

        List<Integer> listResult = new ArrayList<>();
        Set<Integer> listTemp = new HashSet<>();
        for (Integer i: listValue) {
            if(!listTemp.add(i)){
                listResult.add(i);
            }
        }
        listTemp = new HashSet<>(listResult);

        return listTemp;
    }
}
