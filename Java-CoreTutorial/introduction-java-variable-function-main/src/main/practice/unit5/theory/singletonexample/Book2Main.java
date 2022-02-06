package main.practice.unit5.theory.singletonexample;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class Book2Main {
    public static void main(String[] args) {
        Book2 book = Book2.getInstance();
        Book2 book1 = Book2.getInstance();

        // compareTo Book instance:
        System.out.println(book.equals(book1));
    }
}
