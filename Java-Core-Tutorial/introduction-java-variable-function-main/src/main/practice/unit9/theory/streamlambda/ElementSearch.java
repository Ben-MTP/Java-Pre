package main.practice.unit9.theory.streamlambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author ManhKM on 2/7/2022
 * @Logic Tìm kiếm phần tử có trong một list cho trước.
 * @project introduction-java-variable-function-main
 */
public class ElementSearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,10,11,12);
        int maximumValue = 6;

        SearchN(list, maximumValue);
    }

    private static void SearchN(List<Integer> list, int maximumValue) {
        Optional<Integer> s = list.stream()
                .filter(i -> i >= maximumValue)
                .findFirst();
        System.out.println("List value bigger " + maximumValue + ": ");
        if(s.isPresent()){
            System.out.println(s.get());
        }
    }
}
