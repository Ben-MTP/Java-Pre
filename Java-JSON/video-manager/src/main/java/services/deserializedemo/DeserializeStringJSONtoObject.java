package services.deserializedemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Address;

import java.io.IOException;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class DeserializeStringJSONtoObject {
    public static void main(String[] args) {
        String json = "{\"nation\":\"Việt Name\",\"city\":\"Thái Bình\",\"district\":\"Đông Hưng\"}";

        System.out.println(json);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Address address = objectMapper.readValue(json, Address.class);
            System.out.println(address);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
