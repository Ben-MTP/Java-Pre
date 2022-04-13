package core.lambdaexpression.oneparam;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Lambda
 */
public class LambdaExpressionOneParam {
    public static void main(String[] args) {
        /**
         * Thực hiện tạo instance của Interface:
         * Trong đó method rả về trong Interface -> return String
         * Hàm triển khai Lambda -> trả về một chuỗi String tương ứng.
         */
        HelloInterfaceOneParam s = name -> {
            return ("Hello, " + name);
        };
        System.out.println(s.sayHello("ManhKM"));
    }
}
