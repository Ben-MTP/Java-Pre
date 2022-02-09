package services.serializedemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import model.Video;

import java.time.LocalDateTime;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class SerializeObjectToJSON {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//        objectMapper.registerModule(new JSR310Module());
        Video video = new Video("giai-tri", "descript-giai-tri", "100",
                100L, "02/02/2022", "03/02/2022",
                "admin", "manhkm");
        String json = objectMapper.writeValueAsString(video);
        System.out.println(json);
    }
}
