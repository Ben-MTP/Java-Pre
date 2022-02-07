package main.practice.unit9.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 2/7/2022
 *      1. Logic sort theo age, name, chieu_cao
 * @project introduction-java-variable-function-main
 */
public class SortObjectDemo {
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
        int param = 3;

        // Coding something bài tập
        System.out.println(sortByCondition(people, param));

    }

    private static List<Person> sortByCondition(List<Person> people, int param) {
        Person person;
        int size = people.size();
        switch (param){
            case 1:{
                System.out.println("Sort by name: ");
                /**
                 * Duyệt list person
                 * Nếu person A > person B.
                 * Hoán đổi vị trị của A cho B.
                 */

                for (int i = 0; i < size - 1; i++){
                    for (int j = i + 1; j < size; j++){
                        if((people.get(i).getName()).toCharArray()[0] > (people.get(j).getName()).toCharArray()[0]){
                            person = people.get(i);
                            people.set(i, people.get(j));
                            people.set(j, person);
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Sort by age: ");
                for (int i = 0; i < size - 1; i++){
                    for (int j = i + 1; j < size; j++){
                        if(people.get(i).getAge() > people.get(j).getAge()){
                            person = people.get(i);
                            people.set(i, people.get(j));
                            people.set(j, person);
                        }
                    }
                }
                break;
            }
            case 3: {
                System.out.println("Sort by high: ");
                for (int i = 0; i < size - 1; i++){
                    for (int j = i + 1; j < size; j++){
                        if(people.get(i).getHigh() > people.get(j).getHigh()){
                            person = people.get(i);
                            people.set(i, people.get(j));
                            people.set(j, person);
                        }
                    }
                }
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
