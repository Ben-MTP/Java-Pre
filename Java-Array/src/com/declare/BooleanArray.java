package com.declare;

/**
 * @author ManhKM on 11/27/2021
 * @project Java-Pre
 */
public class BooleanArray {
    public static void main(String[] args) {
        Boolean[] arrayBoolean = new Boolean[5];
        for (int i = 0; i < arrayBoolean.length; i++){
            arrayBoolean[i] = true;
        }

        for (Boolean i:
             arrayBoolean) {
            System.out.println(i);
        }
    }
}
