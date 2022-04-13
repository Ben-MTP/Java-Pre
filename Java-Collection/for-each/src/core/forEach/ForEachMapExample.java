package core.forEach;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Collection
 */
public class ForEachMapExample {
    public static void main(String[] args){
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Java");
        hmap.put(2, "JavaScript");
        hmap.put(3, "PHP");
        hmap.put(4, "C#");
        hmap.put(5, "C++");

        /**
         * ForEach to iterate and display each key
         * and value pair of HashMap
         */
        hmap.forEach(
                (key, value) -> System.out.println(key + " - " + value)
        );
    }
}
