package services;

import org.json.JSONObject;

/**
 * Phút thứ 13.
 *      json -> Object String
 *      jsonObject -> JSONObject Class.
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class JsonString {
    public static void main(String[] args) {
        // String json = "{\"address\":\"Thái Bình - Hà Nội\",\"balance\":2000,\"name\":\"Khổng Minh Mạnh\",\"age\":18}";
        String json = "{\"address\":{\"nation\":\"Việt Nam\",\"city\":\"Thái Bình\",\"district\":\"Đông Hưng\",\"ward\":\"Đông Xuân\",\"village\":\"Xóm 4 - Thôn Lê Lợi 2\"},\"balance\":{\"basic_salary\":1000,\"bonus\":500,\"allowance\":1000},\"name\":{\"first_name\":\"Mạnh\",\"last_name\":\"Khổng Minh\"},\"age\":18,\"info\":{\"a\": 12, \"b\":13, \"c\":14,\"d\":15,\"e\":[16,17,18,19]}}";
        JSONObject jsonObject = new JSONObject(json);

        System.out.println(json);
        System.out.println(jsonObject);
        System.out.println(jsonObject.getClass());

        /**
         * Get value of JSON:
         * address:
         * balance:
         * name:
         * age:
         * info:
         * List các method thường sử dụng:
         * + get
         * + getJSONObject
         * + getString, getInt...
         */
        System.out.println("Danh sách các thuộc tính trong JSONObject: ");
        System.out.println(jsonObject.get("address"));
        System.out.println(jsonObject.getJSONObject("address").get("nation"));
        System.out.println(jsonObject.get("balance"));
        System.out.println(jsonObject.get("name"));
        System.out.println(jsonObject.get("age"));
        System.out.println(jsonObject.get("info"));
    }
}
