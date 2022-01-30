package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Cho xâu kí tự: hello techzonefun
 * Hãy bóc tách và trả về techzonefun
 */
public class Unit1 {
    public static void main(String[] args) {
        String myValue = "hello techzonefun";

        /**
         * Case 1: Tìm đến dấu cách ' '
         * cắt từ vị trí đó đến cuối.
         */
        int indexCach = myValue.indexOf(' ');
        System.out.println("Result String: " + myValue.substring(indexCach, myValue.length()).trim());

    }
}
