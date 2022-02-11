package techvid.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
@Entity
public class BasicVideo{
    private @Id Long id;
    private String title;
    private String description;
    private String authorId;

    public BasicVideo(){
        super();
    }

    public BasicVideo(Long id, String title, String description, String authorId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.authorId = authorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "BasicVideo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }
}
