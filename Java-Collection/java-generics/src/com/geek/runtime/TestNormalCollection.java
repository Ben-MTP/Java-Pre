package com.geek.runtime;

import java.util.ArrayList;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class TestNormalCollection {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("Minh");
        arrayList.add("Mạnh");
        arrayList.add("Thái Bình");
        arrayList.add("Hà Nội");
        arrayList.add("Việt Nam");
        arrayList.add(100);
        arrayList.add(String.valueOf(200));

        String s1 = (String) arrayList.get(0);
        String s2 = (String) arrayList.get(1);
        String s5 = (String) arrayList.get(5);
    }

}
