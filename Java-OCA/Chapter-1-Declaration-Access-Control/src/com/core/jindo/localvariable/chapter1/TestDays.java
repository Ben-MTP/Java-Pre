package com.core.jindo.localvariable.chapter1;

/**
 * @author ManhKM on 6/3/2022
 * @project Java-OCA
 */
public class TestDays {
    public enum Days {MON, TUE, WED};
    public static void main(String[] args){
        for(Days d : Days.values())
            ;
        Days [] d2 = Days.values();
        System.out.println(d2[2]);
    }
}
