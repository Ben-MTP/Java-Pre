package core.huongdanjava.lambdaex;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 */
public class Example {
    public static void main(String[] args) {
        SayHello1 sayHello1 = (name) -> {
            System.out.println("Hello, " + name);
        };
        sayHello1.say("ManhKM");
    }
}
