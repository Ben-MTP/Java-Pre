package main.practice.unit5.theory.singletonexample;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class BookMain {
    public static void main(String[] args) {
        // Triển khai instance số 1:
        Book book1 = Book.getInstance();
        System.out.println(book1);

        // Triển khai instance số 2:
        Book book2 = Book.getInstance();
        System.out.println(book2);

        System.out.println(book1.equals(book2));
    }
}
