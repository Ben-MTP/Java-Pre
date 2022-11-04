package core.huongdanjava.oldversion;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 * ----
 * Cách 2: Triển khai method Interface thông qua Anonymous class:
 */
public class Example2 {
    public static void main(String[] args) {
        SayHello sh = new SayHello() {
            @Override
            public void say() {
                System.out.println("Hello VietNam");
            }
        };
        sh.say();
    }
}
