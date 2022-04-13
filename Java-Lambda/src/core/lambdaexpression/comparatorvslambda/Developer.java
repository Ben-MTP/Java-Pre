package core.lambdaexpression.comparatorvslambda;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Lambda
 */
public class Developer {
    private String name;
    private int age;

    public Developer(){}

    public Developer(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
