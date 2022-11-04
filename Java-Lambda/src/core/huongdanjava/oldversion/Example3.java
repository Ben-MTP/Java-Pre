package core.huongdanjava.oldversion;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 * -----
 * Cách 3: Sử dụng thông qua Lambda Expression
 */
public class Example3 {
    public static void main(String[] args) {
        SayHello sh = () -> {
            System.out.println("HelloWorld Lambda Expression");
            System.out.println("VietNam!!");
        };
        sh.say();
    }
}
