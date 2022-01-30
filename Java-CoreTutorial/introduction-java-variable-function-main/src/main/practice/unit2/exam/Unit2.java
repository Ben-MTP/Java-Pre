package main.practice.unit2.exam;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 * Cho mảng các xâu kí tự tùy ý.
 * Hãy in ra các xâu có chứa tech
 * Ví dụ: "abc, tezch", "techae ede", "helltechx", "123e"....
 * kết quả: techae ede, helltechx
 */
public class Unit2 {
    public static void main(String[] args) {
        String[] valueArray = new String[5];
        valueArray[0] = "abc, tezch";
        valueArray[1] = "techae ede";
        valueArray[2] = "helltechx";
        valueArray[3] = "123e";
        valueArray[4] = "manhkm techdhjsdkshd";

        // show all value of array:
//        for (String i: valueArray) {
//            System.out.println(i);
//        }

        /**
         * Kiểm tra giá trị "tech" có trong chuỗi cho trước hay không.
         * method: indexOf -> nếu có thì trả về index của nó trong chuỗi cha
         * nếu không có thì trả -1
         */
        for (String i: valueArray) {
            if(i.indexOf("tech") != -1){
                System.out.println(i);
            }
        }
    }
}
