package core.lambdaexpression.comparatorvslambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author ManhKM on 4/12/2022
 * @project Java-Lambda
 */
public class ComparatorVsLambda {
    public static void main(String[] args) {
        List<Developer> listDevs = new ArrayList<>();

        /**
         * Init data: listDevs
         */
        listDevs.add(new Developer("ManhKM", 18));
        listDevs.add(new Developer("LuongDT", 19));
        listDevs.add(new Developer("ThangLV", 16));

        /**
         * Using Method default for method sort().
         *
         listDevs.sort(new Comparator<Developer>() {
                     @Override
                     public int compare(Developer o1, Developer o2) {
                         return o2.getAge() - o1.getAge();
                     }
                 });
         */


        /**
         * Using Lambda in method sort:
         * Mục địch lúc này sẽ viết làm hàm comparer của Interface Comparator:
         */
        listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());


        /**
         * Show data of List Developer:
         */
        for (Developer item: listDevs) {
            System.out.println(item.toString());
        }
    }
}
