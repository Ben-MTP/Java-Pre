package techvid.model;

/**
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
public class Video extends BaseEntity{
    private String title;
    private String description;
    private String authorId;

    public Video(){
        super();
    }

    public Video(String title, String description, String authorId, Long id, String createAt, String modifyAt, String createBy, String modifyBy) {
        //super(id, LocalDateTime.parse("2011-11-20T13:45:30.12345"), LocalDateTime.parse("2011-12-20T13:45:30.12345"), "admin", "manhkm");
        super(id, createAt, modifyAt, createBy, modifyBy);
        this.title = title;
        this.description = description;
        this.authorId = authorId;
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
        return "Video{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }
}
