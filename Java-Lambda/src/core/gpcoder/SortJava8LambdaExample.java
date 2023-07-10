package core.gpcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortJava8LambdaExample {
    public static void main(String[] args) {
        System.out.println("Using Lambda Expression");
        List<String> languages = Arrays.asList("a", "b", "c", "t", "m");

        /**
         * Có nghĩa là nó định nghĩa ra một hàm ẩn danh:
         * No name
         * Có danh sách tham số truyền vào như thường
         * Body: xử lý biểu thức hoặc câu lệnh
         * No return type: Không có kiểu giá trị trả về tường minh.
         * Trình biên dịch Java 8 tự có thể duy luận ra kiểu dữ liệu khi code chạy
         */
        Collections.sort(languages, (String o1, String o2) -> {
            return o1.compareTo(o2);    // Đối với 1 khối lệnh có thể bỏ {}
        });

        for (String language : languages){
            System.out.print(language + ", ");
        }

    }
}
