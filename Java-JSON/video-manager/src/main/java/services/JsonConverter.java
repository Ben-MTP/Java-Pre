package services;

import org.json.JSONObject;

/**
 * 1. Việc tạo jsonObject từ các yếu tố trên.
 *
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class JsonConverter {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Khổng Minh Mạnh");
        jsonObject.put("age", 18);
        jsonObject.put("address", "Thái Bình - Hà Nội");
        jsonObject.put("balance", 2000);

        /**
         * Khởi tạo JSONObject:
         * + Với các thuộc tính: name, age, address, balance
         */
        System.out.println("Object JSON: ");
        System.out.println(jsonObject);

        /**
         * Việc chuyển đổi Object jsonObject thành kiểu String:
         * ?? Nó có khác gì với JSON Object thông thường hay không?
         */
        String jsonConverted = jsonObject.toString();
        System.out.println("JSON object sau khi được convert thành String: ");
        System.out.println(jsonConverted);
    }
}
