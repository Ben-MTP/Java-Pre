package core.huongdanjava.functioninterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 7/21/2022
 * @project Java-Lambda
 */
public class FunctionInterface {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Manh", "Trang");
        s.stream().forEach(System.out::println);
    }
}
