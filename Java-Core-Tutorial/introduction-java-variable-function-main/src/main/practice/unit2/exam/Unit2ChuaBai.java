package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Cho mảng các xâu kí tự tùy ý.
 * Hãy in ra các xâu có chứa tech
 * Ví dụ: "abc, tezch", "techae ede", "helltechx", "123e"....
 * kết quả: techae ede, helltechx
 */
public class Unit2ChuaBai {
    public static void main(String[] args) {
        String[] input = {
                "hello",
                "khong minh manh",
                "this is a java class"
        };
        lookup(input, "manh");
    }

    /**
     * Đặt tên method -> bắt đầu bằng một động từ
     * @param inputs
     * @param keyword
     */
    private static void lookup(String[] inputs, String keyword) {
        for(int i = 0; i < inputs.length; i++){
            String input = inputs[i];
            if(input.indexOf(keyword) >= 0){
                System.out.println(input);
            }
        }
    }
}
