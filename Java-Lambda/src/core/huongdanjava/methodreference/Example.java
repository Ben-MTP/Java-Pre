package core.huongdanjava.methodreference;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 * -----
 * Object::methodName
 */
public class Example {
    public static void main(String[] args) {
        
        SayHello sayHello = System.out::println;
        sayHello.sayHello("ManhKM");
    }
}
