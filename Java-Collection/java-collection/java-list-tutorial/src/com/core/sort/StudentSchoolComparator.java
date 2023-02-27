package com.core.sort;

import java.util.Comparator;

/**
 * @author ManhKM on 8/25/2022
 * @project java-collection
 */
public class StudentSchoolComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.getSchoolName().compareTo(o2.getSchoolName());
  }
}
