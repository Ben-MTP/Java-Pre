package main.practice.unit3.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Khởi tạo lít A gồm N số tự nhiên đầu tiên.
 * Hãy nhập vào một số x.
 * Trả về danh sách các số trong list A chia hết cho x.
 */
public class Unit3 {
    public static void main(String[] args) {
        List<Integer> listValue = new ArrayList<>(
                Arrays.asList(11,32,43,54,65,43,231,43,54,32,21,432,43,54,65,6757,6,56454,54,2332)
        );

        int divisorValue = 4;
        System.out.println("List value %4 == 0: ");
        for (Object element: lookup(listValue, divisorValue)) {
            System.out.print(element + ", ");
        }
    }

    private static List<Integer> lookup(List<Integer> listValue, Integer divisorValue) {
        List<Integer> listResult = new ArrayList<>();

        /**
         * Duyệt list:
         * TH1 -> value(i) % x == 0;
         *      -> add into listResult.
         */
        int lengthOfList = listValue.size();
        int iCount = 0;
        while (iCount < lengthOfList){
            if(listValue.get(iCount) % divisorValue.intValue() == 0){
                listResult.add(listValue.get(iCount));
            }
            iCount++;
        }
        return listResult;
    }
}
