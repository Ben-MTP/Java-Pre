package com.core;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 * -----
 * Thực hành việc Generic với một Object
 */
public class MethodGeneric {

    /**
     * In ra toàn bộ dữ liệu của mảng với kiểu là Element do người dùng truyền vào.
     * @param elements - Tên của mảng
     * @param <E> - kiểu của dữ liệu mảng
     */
    public static <E> void printArray(E[] elements){
        for (E element : elements){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 11, 12, 13, 14, 15, 16, 17};

        Character[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};

        String[] stringArray = {"Khong Minh Manh", "Hà Nội", "Thái Bình", "Trời mưa to", "Trời nắng to"};



        System.out.println("In mảng các số nguyên: ");
        printArray(intArray);

        System.out.println("In mảng các ký tự: ");
        printArray(charArray);

        System.out.println("In mảng có chuỗi: ");
        printArray(stringArray);
    }
}
