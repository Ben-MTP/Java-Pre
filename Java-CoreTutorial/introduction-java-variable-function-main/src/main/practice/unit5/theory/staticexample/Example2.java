package main.practice.unit5.theory.staticexample;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class Example2 {
    static int i = 1;

    static {
        System.out.println("1. Set i = 2");
        i = 12;
    }

    public Example2(){
        System.out.println("2. This is default constructor -> i = " + i);
        i = 3;
    }

    public static void main(String[] args) {

        System.out.println("3. Start example test 1 -> i = " + i);
        new Example2();
        new Example2();
    }
}
