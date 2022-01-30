package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Viết chương trình tìm kí tự được lặp nhiều nhất trong một chuỗi.
 * Trả về kí tự và thông tin số lần lặp.
 * Chỉ trả về kết quả nếu số lần lặp lớn hơn 1
 * Ví dụ:
 * AbceA -> kết quả A: 2
 * manhkma -> kết quả m: 2, a: 2
 *
 */
public class Unit6 {
    public static void main(String[] args) {
        String[] arrayString = {
                "khongn",
                "manhkm",
                "AbbA",
                "AbcbA",
                "Abba",
                "abc"
        };
        lookup(arrayString);
    }

    private static void lookup(String[] arrayString) {

        count(arrayString[0]);
    }

    /**
     * Phân tích code:
     * B1 > chuyển String thành mảng chuỗi kí tự
     * B2 >
     * @param value -> số lần đếm được trong một String.
     */
    private static void count(String value) {

    }
}
