package main.practice.unit3.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Cho Map gồm tên người và tuổi.
 * Hãy tìm ra tên người có tuổi lớn nhất.
 * Giả thiết tên trong danh sách đã cho không bị trùng.
 */
public class Unit7 {

    public static void main(String[] args) {
        Map<String, Integer> listPeople = new HashMap<>();
        listPeople.put("Mạnh", 18);
        listPeople.put("Trang", 14);
        listPeople.put("Minh", 12);
        listPeople.put("Thắng", 16);
        listPeople.put("Hải", 19);

        System.out.println(lookup(listPeople));
    }

    private static String lookup(Map<String, Integer> listPeople) {
        /**
         * Duyệt toàn bộ Map
         */
        Integer maxAge = listPeople.get("Mạnh");
        String nameOfPeople = null;
        for (Map.Entry<String, Integer> i: listPeople.entrySet()) {
            if(i.getValue() >= maxAge){
                maxAge = i.getValue();
                nameOfPeople = i.getKey();
            }
        }

        return "Name: " + nameOfPeople + " - age: " + maxAge;
    }
}
