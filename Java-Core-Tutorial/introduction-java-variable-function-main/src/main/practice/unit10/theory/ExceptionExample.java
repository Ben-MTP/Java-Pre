package main.practice.unit10.theory;

/**
 * Các trường hợp thử nghiệm:
 *      +
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class ExceptionExample {
    public static void main(String[] args) {
        Person p = new Person("manhkm", 18);
        display(p);
    }

    private static void display(Person p) {
        System.out.println("["+p.getName() + " - " + p.getAge()+"]");
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}