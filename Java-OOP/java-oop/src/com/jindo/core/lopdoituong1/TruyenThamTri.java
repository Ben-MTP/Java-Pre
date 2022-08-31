package com.jindo.core.lopdoituong1;

/**
 * @author ManhKM on 8/31/2022
 * @project java-oop
 * -----
 * Truyền tham trị trong Java
 * Reference: https://gochocit.com/ngon-ngu-lap-trinh/truyen-tham-tri-va-tham-chieu-cho-phuong-thuc-trong-java
 */
public class TruyenThamTri {

    public static void main(String[] args) {
        int number1 = 111;
        int number2 = 222;

        System.out.println("Trước khi swap(): n1 = " + number1 + ", n2 = " + number2);
        swap(number1, number2);
        System.out.println("Sau khi swap(): n1 = " + number1 + ", n2 = " + number2);
    }

    private static void swap(int number1, int number2) {

        System.out.println("    Giá trị các biến trong hàm swap(): ");
        System.out.println("        [In method swap] Trước khi swap(): n1 = " + number1 + ", n2 = " + number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("        [In method swap] Sau khi swap(): n1 = " + number1 + ", n2 = " + number2);

    }
}
