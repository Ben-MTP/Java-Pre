package main.practice.unit5.theory.singletonexample;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class Book {
    private static Book instance;

    private Book(){}

    public static Book getInstance(){
        if(instance == null){
            instance = new Book();
        }
        return instance;
    }
}
