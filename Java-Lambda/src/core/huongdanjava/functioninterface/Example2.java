package core.huongdanjava.functioninterface;

import java.util.function.Consumer;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 */
public class Example2 {
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> {
            System.out.println(s + " ManhKM");
        };

        Consumer<String> c2 = (s) -> {
            System.out.println(s + " UET-VNU");
        };

        c1.andThen(c2).accept("Hello,");
    }
}
