package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Kiểm tra xâu có đối xứng hay không?
 * Phân tích thuật toán:
 * TH: Nếu kích thước chuỗi đó là số chẵn
 * TH: Nếu kích thước chuỗi đó là số lẻ -> bỏ qua phần từ ở giữa
 *
 */
public class Unit3 {
    public static void main(String[] args) {
        String[] arrayValue = new String[5];
        arrayValue[0] = "a";
        arrayValue[1] = "fghhgfdsds";
        arrayValue[2] = "bgrrgbnhj";
        arrayValue[3] = "zxcvbbvccxz";
        arrayValue[4] = "aasdsaa";

        for (String i : arrayValue) {
            if(isCheck(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * TH1: array[i] == array[n - i - 1]
     * @param value
     * @return
     */
    public static boolean isCheck(String value){
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
