package techvid.model;

/**
 * @author ManhKM on 2/10/2022
 * @project video-api
 */
public class BaseEntity {
    private Long id;
    private String createAt;
    private String modifyAt;
    private String createBy;
    private String modifyBy;

    public BaseEntity(){}
    public BaseEntity(Long id, String createAt, String modifyAt, String createBy, String modifyBy) {
        this.id = id;
        this.createAt = createAt;
        this.modifyAt = modifyAt;
        this.createBy = createBy;
        this.modifyBy = modifyBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(String modifyAt) {
        this.modifyAt = modifyAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createAt='" + createAt + '\'' +
                ", modifyAt='" + modifyAt + '\'' +
                ", createBy='" + createBy + '\'' +
                ", modifyBy='" + modifyBy + '\'' +
                '}';
    }
}
