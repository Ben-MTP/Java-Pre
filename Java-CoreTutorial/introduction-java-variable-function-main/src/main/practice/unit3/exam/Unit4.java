package main.practice.unit3.exam;

import java.util.*;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Khởi tạo list A gồm N số tự nhiên đầu tiên.
 * Trả về danh sách các số chẵn
 */
public class Unit4 {
    public static void main(String[] args) {
        Set<Integer> listValue = new HashSet<>(
                Arrays.asList(11,32,32,32,32,32,32,32,32,32,32,32,43,54,65,43,231,43,54,32,21,432,43,54,65,6757,6,56454,54,2332)
        );

        System.out.println(lookup(listValue));
    }

    private static Set<Integer> lookup(Set<Integer> listValue) {

        Set<Integer> listResult = new HashSet<>();
        for (Integer i: listValue) {
            if(i % 2 == 0){
                listResult.add(i);
            }
        }
        return listResult;
    }
}
