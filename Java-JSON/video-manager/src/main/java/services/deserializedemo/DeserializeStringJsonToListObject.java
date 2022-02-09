package services.deserializedemo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Video;

import java.util.List;

/**
 * @author ManhKM on 2/9/2022
 * @project video-manager
 */
public class DeserializeStringJsonToListObject {
    public static void main(String[] args) {
        String json = "[{\"id\":100,\"createAt\":\"02/02/2022\",\"modifyAt\":\"03/02/2022\",\"createBy\":\"admin\",\"modifyBy\":\"manhkm\",\"title\":\"giai-tri\",\"description\":\"descript-giai-tri\",\"authorId\":\"100\"},{\"id\":101,\"createAt\":\"02/02/2022\",\"modifyAt\":\"03/02/2022\",\"createBy\":\"admin\",\"modifyBy\":\"manhkm\",\"title\":\"hoc-tap\",\"description\":\"descript-hoc-tap\",\"authorId\":\"100\"},{\"id\":102,\"createAt\":\"02/02/2022\",\"modifyAt\":\"03/02/2022\",\"createBy\":\"admin\",\"modifyBy\":\"manhkm\",\"title\":\"the-thao\",\"description\":\"descript-the-thao\",\"authorId\":\"100\"},{\"id\":103,\"createAt\":\"02/02/2022\",\"modifyAt\":\"03/02/2022\",\"createBy\":\"admin\",\"modifyBy\":\"manhkm\",\"title\":\"suc-khoe\",\"description\":\"descript-suc-khoe\",\"authorId\":\"100\"}]";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Video> videoList = objectMapper.readValue(json, new TypeReference<List<Video>>() {
            });

            /**
             * List ra toàn bộ thông tin Video:
             * + thông tin trong lớp cha
             * + thông tin trong lớp con
             */

            for (Video i: videoList) {
                System.out.print(i.getAuthorId() + " - " +i.getDescription() +" - "+i.getTitle() +" - "+ i.getCreateAt()
                        + " - " +i.getModifyAt() + " - " +i.getCreateBy() + " - " +i.getModifyBy());
                System.out.println();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
