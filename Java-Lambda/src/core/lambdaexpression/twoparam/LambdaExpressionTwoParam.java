package core.lambdaexpression.twoparam;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Lambda
 */
public class LambdaExpressionTwoParam {
    public static void main(String[] args) {
        HelloInterfaceTwoParam s = (String name, String com) -> {
            return "Hello, " + name + ". Welcome to " + com;
        };
        System.out.println(s.sayHello("ManhKM", "UET-VNU"));
    }
}
