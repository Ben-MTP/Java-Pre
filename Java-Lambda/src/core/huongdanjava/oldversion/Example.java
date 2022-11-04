package core.huongdanjava.oldversion;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 * -----
 * Cách 1: Triển khai method sayHello của Interface thông qua class Implement chính Interface đó.
 */
public class Example {
    public static void main(String[] args) {
        SayHello sayHello = new SayHelloImpl();
        sayHello.say();
    }
}
