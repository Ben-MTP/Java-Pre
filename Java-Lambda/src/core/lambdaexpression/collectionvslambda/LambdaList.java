package core.lambdaexpression.collectionvslambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 */
public class LambdaList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ManhKM");
        list.add("TrangTT");
        list.add("TrangKT");

        /**
         * Nếu chỉ in ra không thì lambda là một lựa chọn cực hợp lý
         */
        list.forEach(item -> System.out.print(item + ", "));
        System.out.println("----------");
        list.forEach(System.out::println);
    }
}
