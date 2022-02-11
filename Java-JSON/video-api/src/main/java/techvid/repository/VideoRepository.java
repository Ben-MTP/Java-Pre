package techvid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import techvid.model.BasicVideo;

/**
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
public interface VideoRepository extends JpaRepository<BasicVideo, Long> {
}
