package com.core.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class SortingListOfInteger {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,4,5,6,7,8,5,9);

        System.out.println("Before sorting: " + integerList);

        Collections.sort(integerList);

        System.out.println("After sorting: " + integerList);

        Collections.reverse(integerList);

        System.out.println("After reversing: " + integerList);

    }

}
