package main.practice.unit3.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Khởi tạo list A gồm N số tự nhiên đầu tiên.
 * Hãy nhập vào mố số x
 * Trả về danh sách các số trong list A lớn hơn x
 */
public class Unit5 {
    public static void main(String[] args) {
        Set<Integer> listValue = new HashSet<>(
                Arrays.asList(11,32,32,32,32,32,32,32,32,32,32,32,43,54,65,43,231,43,54,32,21,432,43,54,65,6757,6,56454,54,2332)
        );

        int valueMax = 100;

        System.out.println(lookup(listValue, valueMax));
    }

    private static Set<Integer> lookup(Set<Integer> listValue, int valueMax) {
        Set<Integer> listResult = new HashSet();
        for (Integer i: listValue) {
            if(i >= valueMax){
                listResult.add(i);
            }
        }

        return listResult;
    }
}
