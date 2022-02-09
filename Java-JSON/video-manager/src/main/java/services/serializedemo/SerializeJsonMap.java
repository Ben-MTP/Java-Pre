package services.serializedemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Address;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class SerializeJsonMap {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Khổng Minh Mạnh");
        map.put("address", new Address("Việt Name", "Thái Bình", "Đông Hưng"));
        map.put("age", 18);

        try {
            String json = objectMapper.writeValueAsString(map);
            System.out.println(json);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
