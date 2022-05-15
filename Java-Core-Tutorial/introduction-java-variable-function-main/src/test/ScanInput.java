package test;

import java.util.Scanner;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class ScanInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your age: ");
        int age = in.nextInt();

        System.out.println(printValue(name, age));

    }

    static String printValue(String name, int age){
        return "Name: " + name + " - Age: " + age;
    }
}
