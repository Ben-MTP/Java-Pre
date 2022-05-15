package main.practice.unit9.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class BasicSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("ManhKM", 18, 1.9));
        people.add(new Person("Hiếu", 17, 1.7));
        people.add(new Person("Thu Trang", 18, 1.8));
        people.add(new Person("Hải", 20, 1.6));
        people.add(new Person("Cường", 18, 1.66));
        people.add(new Person("Thắng", 16, 1.77));
        people.add(new Person("Anh", 13, 1.59));

        System.out.println("Sort by Age: ");
        people.sort(Comparator.comparingInt(p -> p.getAge()));
        System.out.println(people);

        System.out.println("Sort by Name: ");
        people.sort(Comparator.comparing(p -> p.getName()));
        System.out.println(people);

        System.out.println("Sort by High: ");
        people.sort(Comparator.comparingDouble(p -> p.getHigh()));
        System.out.println(people);
    }
}
