package main.practice.unit2;

/**
 * @author ManhKM on 1/30/2022
 * @project introduction-java-variable-function-main
 */
public class StringTest {
    public static void main(String[] args) {
        String myValue = "Hôm nay là một ngày khá đẹp trời";
        String myEmail = "minhmanh.evn@gmail.com";

        // Độ dài của chuỗi:
        System.out.println("Độ dài của chuỗi: " + myValue.length());

        // Lấy giá trị ở vị trí 29:
        System.out.println("Giá trị ở vị trí số 29: " + myValue.charAt(29));

        // Kiểm tra định dạng email thuộc tông ty hay không?
        //String subString = myEmail.substring(9);
        //System.out.println(subString);
        int indexOfSymbol = myEmail.indexOf('@');
        int lengthOfEmail = myEmail.length();
        String companySymbol = myEmail.substring(indexOfSymbol, lengthOfEmail);
        System.out.println("Tên miền của công ty: "+companySymbol);

        /**
         * Nối chuỗi trong Java:
         * Cách 1: Dùng toán tử cộng -> thiên về hướng function
         * Cách 2: Dùng toán từ concat -> thiên về hướng đối tượng.
         */
        String fullInfor = myValue + myEmail;
        System.out.println("Full information: " + fullInfor);

        String fullInforV2 = myValue.concat(myEmail);
        System.out.println("Full information cách 2: " + fullInforV2);
    }
}
