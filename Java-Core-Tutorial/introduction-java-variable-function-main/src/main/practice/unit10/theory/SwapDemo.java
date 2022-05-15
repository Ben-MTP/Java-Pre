package main.practice.unit10.theory;

/**
 * @author ManhKM on 2/8/2022
 * @project introduction-java-variable-function-main
 */
public class SwapDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Trước khi swap: a: " + a +" - b: " + b);
        swap(a, b);
        System.out.println("Sau khi swap: a: " + a +" - b: " + b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Trong khi swap: a: " + a +" - b: " + b);
    }
}
