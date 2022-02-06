package main.practice.unit5.theory.singletonexample;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class Book2 {
    private static Book2 instance = new Book2();

    private Book2(){}

    public static Book2 getInstance(){
        return instance;
    }
}
