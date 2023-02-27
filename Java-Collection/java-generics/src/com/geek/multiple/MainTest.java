package com.geek.multiple;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class MainTest {

    public static void main(String[] args) {
        Test<String, Integer> obj = new Test<String, Integer>("ManhKM", 19);

        obj.print();    // show data
    }

}
