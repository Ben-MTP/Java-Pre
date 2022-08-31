package com.jindo.core.lopdoituong1;

/**
 * @author ManhKM on 8/31/2022
 * @project java-oop
 * -----
 * Kiểu số được object hóa
 */
public class Number {

  private int value;

  public Number(){}

  public Number(int value){
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Number{" +
        "value=" + value +
        '}';
  }
}
