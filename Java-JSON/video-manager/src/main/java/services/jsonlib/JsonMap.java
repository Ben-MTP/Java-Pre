package services.jsonlib;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Tạo mới một JSON từ Map
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class JsonMap {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Khổng Minh Mạnh");
        data.put("fb", "https://fb.com/manhkm.uet");

        JSONObject jsonObject = new JSONObject(data);
        /**
         * jsonObject -> được hiểu đây chính là một Object.
         */
        System.out.println(jsonObject);
    }
}
