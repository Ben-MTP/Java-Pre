package techvid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Đang xây dựng một Video API
 * Các request mapping
 *      localhost:8080/....
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
@RestController
public class VideoController {

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

}
