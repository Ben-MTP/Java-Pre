package services.deserializedemo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class DeserializeStringJsonToMap {
    public static void main(String[] args) {
        String json = "{\"address\":{\"nation\":\"Việt Name\",\"city\":\"Thái Bình\",\"district\":\"Đông Hưng\"},\"name\":\"Khổng Minh Mạnh\",\"age\":18}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> map = objectMapper.readValue(json, Map.class);
            System.out.println(map.get("address"));
            System.out.println(map.get("name"));
            System.out.println(map.get("age"));
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
