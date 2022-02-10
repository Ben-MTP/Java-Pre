package techvid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * File entry -> dùng cho việc chạy ứng dụng của toàn project.
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Running Application - [video-api]");
    }
}
