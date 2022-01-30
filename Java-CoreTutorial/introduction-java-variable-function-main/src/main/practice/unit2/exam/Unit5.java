package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 *
 * Viết chương trình tìm ra xâu đối xứng trong chuỗi các xâu nhập vào.
 * Trả về kết quả yes/no
 * Ví dụ: Xâu đối xứng: "AbbA", "AbcbA"
 * Xâu không đối xứng: "Abba", "abc"
 */
public class Unit5 {
    public static void main(String[] args) {
        String[] arrayString = {
                "khong",
                "manhkm",
                "AbbA",
                "AbcbA",
                "Abba",
                "abc"
        };
        lookup(arrayString);
    }

    private static void lookup(String[] arrayString) {
        for (String i: arrayString) {
            System.out.println(i + " - " + isCheck(i));
        }
    }

    private static boolean isCheck(String value) {
        int lengthOfString = value.length();

        // convert string into ArrayChar:
        char[] ch = new char[value.length()];
        for (int i = 0; i < lengthOfString; i++){
            ch[i] = value.charAt(i);
        }

        // xử lý mảng char
        boolean isResult = false;
        int lengthOfChar = ch.length;
        for(int i = 0; i < lengthOfChar; i++){
            if(ch[i] == ch[lengthOfChar - i -1]){
                isResult = true;
            } else{
                isResult = false;
                break;
            }
        }
        return isResult;
    }
}
