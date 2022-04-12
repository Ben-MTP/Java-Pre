package core.lambdaexpression;

/**
 * Xây dựng hàm thực hiện logic dựa trên InterfaceFunctional
 * @author ManhKM on 4/12/2022
 * @project Java-Lambda
 */
public class LambdaExpression {
    public static void main(String[] args) {
        /**
         * Khai báo một Functional Interface: HelloInterface
         *      s -> thực hiện trả về một giá trị String.
         * Mục đích của Lambda -> tạo ra thể hiện của Functional Interface.
         *
         */
        HelloInterface s = () -> {
            return "Hello Lambda";
        };
        System.out.println(s.sayHello());
    }
}
