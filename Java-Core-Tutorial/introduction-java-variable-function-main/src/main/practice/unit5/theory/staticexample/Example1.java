package main.practice.unit5.theory.staticexample;

/**
 * @author ManhKM on 1/31/2022
 * @project introduction-java-variable-function-main
 */
public class Example1 {
    private static String message = "Khổng Minh Mạnh";

    public Example1(String input){
        this.message = input;
    }

    public static void changeMessage(){
        message = "Thái Bình nhé";
    }

    public String getMessage(){
        return message;
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1("Hello");
        Example1 example2 = new Example1("Goodbye");

        Example1.changeMessage();
        System.out.println(example1.getMessage());
    }
}
