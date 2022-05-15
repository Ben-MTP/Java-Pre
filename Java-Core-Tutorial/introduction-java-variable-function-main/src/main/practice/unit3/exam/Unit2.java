package main.practice.unit3.exam;

import java.util.*;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Khởi tạo list A gồm N số tự nhiên đầu tiên.
 * Trả về số nhỏ nhất
 */
public class Unit2 {
    public static void main(String[] args) {
        List<Integer> listValue = new LinkedList<>(
                Arrays.asList(11,32,43,54,65,43,231,43,54,32,21,432,43,54,65,6757,6,56454,54,2332)
        );
        System.out.println("Giá trị Min trong dãy: " + lookup(listValue));
    }

    private static Integer lookup(List<Integer> listValue) {
        int lengtOfList = listValue.size();
        int minValue = listValue.get(0);
        for(int i = 0; i < lengtOfList; i++){
            if(minValue >= listValue.get(i)){
                minValue = listValue.get(i);
            }
        }

        return minValue;
    }
}
