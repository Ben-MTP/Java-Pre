package main.practice.unit9.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Hướng dẫn sort list Person theo cách dùng Lambda.
 * @author ManhKM on 2/7/2022
 * @project introduction-java-variable-function-main
 */
public class SortObjectDemo2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("ManhKM", 18, 1.9));
        people.add(new Person("Hiếu", 17, 1.7));
        people.add(new Person("Thu Trang", 18, 1.8));
        people.add(new Person("Hải", 20, 1.6));
        people.add(new Person("Cường", 18, 1.66));
        people.add(new Person("Thắng", 16, 1.77));
        people.add(new Person("Anh", 13, 1.59));

        System.out.println(people);

        /**
         * Kiểu sắp xếp:
         * 1. Sắp xếp theo tên
         * 2. Sắp xếp theo tuổi
         * 3. Sắp xếp theo chiều cao.
         */
        int param = 2;

        // Coding something bài tập
        System.out.println(sortByCondition(people, param));
    }

    private static List<Person> sortByCondition(List<Person> people, int param) {
        switch (param){
            case 1: {
                System.out.println("Sort by name: ");
                people.sort(Comparator.comparing(p -> p.getName()));
                break;
            }
            case 2: {
                System.out.println("Sort by age: ");
                people.sort(Comparator.comparingInt(p -> p.getAge()));
                break;
            }
            case 3: {
                System.out.println("Sort by high: ");
                people.sort(Comparator.comparingDouble(p -> p.getHigh()));
                break;
            }
            default:{
                System.out.println("Invalid option!!");
                break;
            }
        }
        return people;
    }
}
