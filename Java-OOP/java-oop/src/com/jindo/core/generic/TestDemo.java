package com.jindo.core.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author ManhKM on 9/1/2022
 * @project java-oop
 */
public class TestDemo {

    public static void main(String[] args) {

        List<PhanSo> list = new ArrayList<>();
        list.add(new PhanSo(2,3));
        list.add(new PhanSo(1,3));
        list.add(new PhanSo(4,3));
        list.add(new PhanSo(5,3));

        list.sort(new Comparator<PhanSo>() {
            @Override
            public int compare(PhanSo o1, PhanSo o2) {
                return 0;
            }
        });

        list.sort((PhanSo p1, PhanSo p2) -> {
            int t1 = p1.getT()*p2.getM();
            int t2 = p1.getM()*p2.getT();
            return t1 - t2;
        });

        list.forEach((PhanSo t1) -> System.out.println(t1));


// Cách 3: Sử dụng Lambda expression:
//        Hello h = (n, a) -> System.out.print("Xin chào Việt Nam - lambda expression: " + n + " - age: " + a);
//        h.show("Khổng Minh Mạnh", 19);

// Cách 2: Lớp nặc danh
//        Hello h = new Hello() {
//            /**
//             * Lớp nặc danh
//             */
//            @Override
//            public void show() {
//                System.out.println("Xin chào Việt Nam from Interface Hello");
//            }
//        };
//        h.show();

// Cách 1: Thông thường
//        Hello h = new ViHello();
//        h.show();
    }
}
