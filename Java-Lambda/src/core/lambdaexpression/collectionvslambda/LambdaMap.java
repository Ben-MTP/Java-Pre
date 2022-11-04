package core.lambdaexpression.collectionvslambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 */
public class LambdaMap {

    public static void main(String[] args) {

        Map<String, Staff> mapData = new HashMap<>();

        mapData.put("MS01", new Staff(1, "Khong Minh Manh"));
        mapData.put("MS02", new Staff(2, "Trang Thu Trang"));
        mapData.put("MS03", new Staff(3, "Khong Thi Thu Trang"));
        mapData.put("MS04", new Staff(4, "XXXX"));

        /**
         * Duyệt MapData theo cách truyền thống
         * Dùng String.format --> ĐỊnh dạng cho log gửi xuống file cũng OK đó nhé
         */
        System.out.println("----Using Normal For-each----");
        for (Entry<String, Staff> item : mapData.entrySet()){
            String key = item.getKey();
            Staff value = item.getValue();
            System.out.println(String.format("Key: %s - Staff[id: %s - value: %s]", key, value.getId(), value.getName()));
        }

        /**
         * Sử dụng cú pháp Lambda:
         * Khi sử dụng từ 2 tham số trở lên thì cần phải sử dụng dấu () và , phân cách chúng
         */
        System.out.println("----Using Lambda Expression----");
        mapData.forEach(
            (key, value) -> System.out.println(String.format("Key: %s - Staff[id: %s - value: %s]",
                key, value.getId(), value.getName()))
        );



    }
}
