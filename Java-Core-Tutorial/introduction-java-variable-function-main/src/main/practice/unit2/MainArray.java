package main.practice.unit2;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class MainArray {
    public static void main(String [] args){

        // Khai báo một mảng:
        int[] arrayInt = new int[5];

        // lấy kích thước của mảng:
        System.out.println("Kich thuoc mang: " + arrayInt.length);

        // Gán giá trị cho mảng:
        arrayInt[0] = 10;
        arrayInt[1] = 11;
        arrayInt[2] = 99;
        arrayInt[3] = 55;
        arrayInt[4] = 44;

        // Truy xuất phần tử mảng:
        for (int i : arrayInt) {
            System.out.println(i);
        }

        // Truy xuất phần từ ngoài phạm vi của mảng:
        System.out.println(arrayInt[5]);
//        try {
//            System.out.println(arrayInt[5]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }

        System.out.println("ManhKM - 18 tuổi");
    }
}
