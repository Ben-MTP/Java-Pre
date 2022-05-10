package com.jindo.core.vd2;

/**
 * @author ManhKM on 5/10/2022
 * @project Banking-synch-unsynch
 */
public class Table {
    //synchronized
    synchronized static void print(String name, int n){
        for (int i = 1; i <= 5; i++){
            System.out.println(name + ": " + i * n);
        }
    }
}
