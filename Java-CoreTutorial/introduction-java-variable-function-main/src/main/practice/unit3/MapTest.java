package main.practice.unit3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Object, Object> listMap = new HashMap<>();
        listMap.put("A1", "Khổng Minh Mạnh");
        listMap.put("A2", "Trần Thu Trang");
        listMap.put("A3", "Thái Bình");
        listMap.put("A4", "Hà Nam");
        listMap.put("A5", "Việt Nam");

        System.out.println(listMap);

        System.out.println(listMap.containsKey("A4"));

        for (Map.Entry<Object, Object> x: listMap.entrySet()){
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
    }
}
