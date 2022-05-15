package main.practice.unit3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Thêm, get, delete
 * add -> index, value
 *     -> thêm vào cuối
 * Kiểm tra xem có chứa phần tử 100 hay không? -> contains
 *
 */
public class CollectionTest {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("Khổng");
        listString.add("Minh");
        listString.add("Mạnh");
        listString.add("18+");

        listString.add(1, "Hà Nội");

        /**
         * Show toàn bộ giá trị trong mảng:
         * Object -> String...
         */
        for (Object element: listString) {
            System.out.println(element);
        }

        System.out.println("Kiểm tra có giá trị Hà Nội: "+listString.contains("Hà Nội"));
    }
}
