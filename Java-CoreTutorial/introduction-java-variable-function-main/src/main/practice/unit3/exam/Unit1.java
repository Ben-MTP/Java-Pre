package main.practice.unit3.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Khởi tạo list A gồm N số tự nhiên đầu tiên.
 * Trả về số lớn nhất
 */
public class Unit1 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>(
                Arrays.asList(11,32,43,54,65,43,231,43,54,32,21,432,43,54,65,6757,6,56454,54,2332)
        );
        System.out.println("Giá trị Max trong dãy: " + lookup(listNumber));
    }

    private static Integer lookup(List<Integer> listNumber) {
        int iCount = 0;
        int maxValue = 0;
        while(iCount < listNumber.size()){
            if(maxValue <= listNumber.get(iCount)){
                maxValue = listNumber.get(iCount);
            }
            iCount++;
        }
        return maxValue;
    }


}
