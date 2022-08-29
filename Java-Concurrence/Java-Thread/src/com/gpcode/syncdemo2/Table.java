package com.gpcode.syncdemo2;

/**
 * @author ManhKM on 3/8/2022
 * @project Java-Thread
 */
public class Table {
    synchronized static void print(String name, int n){
        for (int i = 1; i <= 5; i++){
            System.out.println(name + ": " + i * n);
        }
    }
}
