package core.lambdaexpression.collectionvslambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Lambda
 */
public class CollectionVsLambda {
    public static void main(String[] args) {
        List<String> listData = new ArrayList<>();
        // init data of listData:
        listData.add("ManhKM");
        listData.add("HieuVT");
        listData.add("ThangLV");
        listData.add("LuongTD");

        /**
         * Using Lambda into forEach:
         * Trong đó: n -> danh sách tham số:
         * n đại diện cho một cái gì đó.
         */
        listData.forEach(n -> System.out.println(n));
    }
}
