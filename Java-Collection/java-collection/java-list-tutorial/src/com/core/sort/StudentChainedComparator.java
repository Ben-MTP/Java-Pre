package com.core.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class StudentChainedComparator implements Comparator<Student> {

    private List<Comparator<Student>> listComparator;

    public StudentChainedComparator(Comparator<Student>... comparators) {
        this.listComparator = Arrays.asList(comparators);
    }

    @Override
    public int compare(Student o1, Student o2) {
        for(Comparator<Student> comparator : listComparator){
            int result = comparator.compare(o1, o2);
            if(result != 0){
                return result;
            }
        }
        return 0;
    }
}
