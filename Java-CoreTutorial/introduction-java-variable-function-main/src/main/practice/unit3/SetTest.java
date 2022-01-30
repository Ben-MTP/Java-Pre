package main.practice.unit3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Đảm bảo trong quá trình chạy chỉ có 1 phần tử duy nhất
 * Ưu điểm:
 *      + Giống kiểu của List thôi, size, index...
 *      + Dùng để làm duy nhất cho đối tượng
 *
 * Nhược điểm:
 *      + Chưa tìm ra trường hợp thực tế cần dùng.
 *
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> listSet = new HashSet<>();
        listSet.add("Khổng");
        listSet.add("Minh");
        listSet.add("Mạnh");
        listSet.add("18+");
        listSet.add("Khổng");
        listSet.add("Minh");
        listSet.add("Mạnh");
        listSet.add("18+");
        listSet.add("Thái Bình");
        listSet.add(null);
        listSet.add(null);
        listSet.add(null);
        listSet.add(null);

        for (Object element: listSet) {
            System.out.println(element);
        }
    }
}
