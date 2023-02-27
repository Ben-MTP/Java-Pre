package com.geek.func;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class Test {
    static <T> void genericDisplay(T element){

        // Hiển thị thông tin của lớp T -> trừ tượng truyền vào"
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {

        // Calling generic method with Integer argument:
        genericDisplay(11);

        // Calling generic method with String argument:
        genericDisplay("Khổng Minh Mạnh");

        // Calling generic method with Double argument:
        genericDisplay(3.14);

    }
}
