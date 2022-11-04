package core.lambdaexpression.collectionvslambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 */
public class LambdaCollection {

    public static void main(String[] args) {

        List<Staff> list = new ArrayList<>();
        list.addAll(Arrays.asList(
            new Staff(1, "ManhKM"),
            new Staff(2, "TrangTT"),
            new Staff(3, "TrangKT")
        ));

        System.out.println("Danh sách nhân viên của Công ty: ");
        /**
         * Với mỗi phần tử nằm trong danh sách thì sử dụng lambda để duyệt từng nó ra
         */
        list.forEach(item -> {
            System.out.println("ID: " + item.getId() + " - NAME: " + item.getName());
        });

    }
}
