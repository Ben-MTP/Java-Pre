package core.lambdaexpression.collectionvslambda;

/**
 * @author ManhKM on 11/4/2022
 * @project Java-Lambda
 * -----
 * Định nghĩa một Object Staff - nhân viên
 */
public class Staff {
    private int id;
    private String name;

    public Staff() {
    }

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
