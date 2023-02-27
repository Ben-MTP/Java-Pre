package com.core;

/**
 * @author ManhKM on 8/23/2022
 * @project java-generics
 */
public class MyGenericDemo {

  public static void main(String[] args) {

    // using Integer:
    MyGeneric<Integer> m1 = new MyGeneric<Integer>();
    m1.add(2);
    System.out.println("Value of Generic "+m1.get().getClass() +": "+m1.get());

    // using String:
    MyGeneric<String> m2 = new MyGeneric<String>();
    m2.add("Khong Minh Manh");
    System.out.println("Value of Generic " +m2.get().getClass() +": "+m2.get());
  }
}
