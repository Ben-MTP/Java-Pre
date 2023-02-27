package com.core.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ManhKM on 8/24/2022
 * @project java-collection
 */
public class SortingListOfString {

    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("Khong", "Minh", "Manh", "Hà Nội", "Thái Bình", "A", "W");

        System.out.println("Before sorting: " + listStrings);

        Collections.sort(listStrings);

        System.out.println("After sorting: " + listStrings);
    }
}