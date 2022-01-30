package main.practice.unit2;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder myValue = new StringBuilder("Hôm nay Hà Nội khá là lạnh khoảng 18 oC");
        myValue.append(". Thật sự lạnh");
        myValue.deleteCharAt(1);
        myValue.delete(2, 4);

        System.out.println(myValue);
    }
}
