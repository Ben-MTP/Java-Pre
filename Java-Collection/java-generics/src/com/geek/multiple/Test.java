package com.geek.multiple;

/**
 * @author ManhKM on 8/24/2022
 * @project java-generics
 */
public class Test<T, U> {
  T obj1; // một object có kiểu T
  U obj2; // một object có kiểu U

  // Constructor:
  Test(T obj1, U obj2){
    this.obj1 = obj1;
    this.obj2 = obj2;
  }

  // To print Object of T and U
  public void print(){
    System.out.println(this.obj1);
    System.out.println(this.obj2);
  }
}
