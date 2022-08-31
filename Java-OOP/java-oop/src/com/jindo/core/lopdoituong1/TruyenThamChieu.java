package com.jindo.core.lopdoituong1;

/**
 * @author ManhKM on 8/31/2022
 * @project java-oop
 */
public class TruyenThamChieu {

    public static void main(String[] args) {

        Number number1 = new Number(100);
        Number number2 = new Number(200);

        System.out.println("Trước khi swap(): n1 = " + number1.getValue() + ", n2 = " + number2.getValue());
        swap(number1, number2);
        System.out.println("Sau khi swap(): n1 = " + number1.getValue() + ", n2 = " + number2.getValue());
    }

    private static void swap(Number number1, Number number2) {

        System.out.println("    Giá trị các biến trong hàm swap(): ");
        System.out.println("        [In method swap] Trước khi swap(): n1 = " + number1.getValue() + ", n2 = " + number2.getValue());

        int temp = number1.getValue();
        number1.setValue(number2.getValue());
        number2.setValue(temp);

        System.out.println("        [In method swap] Sau khi swap(): n1 = " + number1.getValue() + ", n2 = " + number2.getValue());
    }
}
