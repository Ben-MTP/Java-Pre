package main.practice.unit9.theory.streamlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,10);
        //Case1(list);

        Case2(list);
    }

    /**
     * Logic -> đọc được logic code -> đơn giản hơn nhiều
     * @param list
     */
    private static void Case2(List<Integer> list) {
        List<Integer> filteredList = list.stream()
                                    .filter(e -> e > 5)
                                    .collect(Collectors.toList());
        System.out.println(filteredList);
    }

    private static void Case1(List<Integer> list) {
        List<Integer> filteredList = new ArrayList<>();

        for (int i: list) {
            if(i > 5){
                filteredList.add(i);
            }
        }
        System.out.println(filteredList);
    }
}
