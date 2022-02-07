package main.practice.unit9.exam;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class Person{
    private String name;
    private int age;
    private double high;

    public Person(String name, int age, double high) {
        this.name = name;
        this.age = age;
        this.high = high;
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                '}';
    }
}