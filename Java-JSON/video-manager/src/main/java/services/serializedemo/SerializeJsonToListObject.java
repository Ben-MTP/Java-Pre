package services.serializedemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.Video;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class SerializeJsonToListObject {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        List<Video> videos = new ArrayList<>();
        videos.add(new Video("giai-tri", "descript-giai-tri", "100",
                100L, "02/02/2022", "03/02/2022",
                "admin", "manhkm"));
        videos.add(new Video("hoc-tap", "descript-hoc-tap", "100",
                101L, "02/02/2022", "03/02/2022",
                "admin", "manhkm"));
        videos.add(new Video("the-thao", "descript-the-thao", "100",
                102L, "02/02/2022", "03/02/2022",
                "admin", "manhkm"));
        videos.add(new Video("suc-khoe", "descript-suc-khoe", "100",
                103L, "02/02/2022", "03/02/2022",
                "admin", "manhkm"));

        try {
            String json = objectMapper.writeValueAsString(videos);
            System.out.println(json);
        } catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }
}
