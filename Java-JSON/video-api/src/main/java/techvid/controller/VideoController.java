package techvid.controller;

import org.springframework.web.bind.annotation.*;
import techvid.model.BasicVideo;
import techvid.model.Video;
import techvid.repository.VideoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * TH1: Đang xây dựng một Video API
 * Các request mapping
 *      localhost:8080/....
 * TH2: Sử dụng với Database H2.
 *      + Sử dụng dependency với H2 database.
 *          + com.h2database
 *      +
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
@RestController
public class VideoController {

    private VideoRepository videoRepository;
    public VideoController(VideoRepository videoRepository){
        this.videoRepository = videoRepository;
    }

    /**
     * Thực hiện việc demo sử dụng RequestMapping
     * HTML hoặc các template khác
     *      Khi đó trả về html, string, hoặc là template.html
     * @return
     */
    @RequestMapping("/")
    public String index(){
        String body = "<html>\n" +
                "<title>Techzone-fun</title>" +
                "<body>\n" +
                "<h1>My First Heading</h1>\n" +
                "<p>My first paragraph.</p>\n" +
                "</body>\n" +
                "</html>";
        return body;
    }

    /**
     * Thực hiện việc findAll video -> extend BasicVideo.
     *      Trong đó các thuộc tính của Video được kế thừa và tái sử dụng lại.
     *
     * @return
     *
    @RequestMapping("/videos")
    public List<Video> findAll(){
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
        return videos;
    }
    */

    /**
     * Sử dụng để list toàn bộ cách basic-video.
     * @return
     */
    @GetMapping("/basic-videos")
    public List<BasicVideo> findAllBasicVideo(){
        List<BasicVideo> videos = new ArrayList<>();
        return videos;
    }

    /**
     * Lấy ra toàn bộ danh sách các Video hiện có trong hệ thống.
     * @return
     */
    @RequestMapping("/videos")
    public List<BasicVideo> getAllVideo(){
        return videoRepository.findAll();
    }

    /**
     * Using return one object Video.
     * Việc giả lập không tạo data trong Database.
     * @param id
     * @return
     */
    @GetMapping("/videos/{id}")
    public BasicVideo findVideoById(@PathVariable(name = "id") Long id){
        BasicVideo video = new BasicVideo();
        video.setId(id);
        video.setTitle("gia-tri");
        video.setDescription("video gia tri cao");
        video.setAuthorId("100");
        return video;
    }

    /**
     * Thêm mới video -> BasicVideo.
     *      Phân biệt BasicEntity -> chứa các thông tin cơ bản mà một Entity cần có.
     *                BasicVideo -> một BasicVideo cơ bản.
     * @param video
     * @return
     */
    @PostMapping("/video")
    public BasicVideo createVideo(@RequestBody BasicVideo video){
        return videoRepository.save(video);
    }

    /**
     * Thực hiện việc xóa video theo id.
     * @param id
     */
    @DeleteMapping("/video/{id}")
    public void deleteVideo(@PathVariable(name = "id") Long id){
        videoRepository.deleteById(id);
    }

    @PutMapping("/video/{id}")
    public BasicVideo updateVideo(@PathVariable(name = "id") Long id, @RequestBody BasicVideo video){
        Optional<BasicVideo> oldVideo = videoRepository.findById(id);
        if(oldVideo.isPresent()){
            oldVideo.get().setTitle(video.getTitle());
            oldVideo.get().setDescription(video.getDescription());
            oldVideo.get().setAuthorId(video.getAuthorId());
            return videoRepository.save(oldVideo.get());
        }

        return videoRepository.save(video);
    }
}
