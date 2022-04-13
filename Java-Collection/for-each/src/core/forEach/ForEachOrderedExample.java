package core.forEach;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Collection
 */
public class ForEachOrderedExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java","JavaScript","PHP");

        System.out.println("Iterating by passing lambda expression: ");
        languages.stream().forEachOrdered(lang -> System.out.println(lang));

        System.out.println("Iterating by passing method reference: ");
        languages.stream().forEachOrdered(System.out::println);
    }
}
