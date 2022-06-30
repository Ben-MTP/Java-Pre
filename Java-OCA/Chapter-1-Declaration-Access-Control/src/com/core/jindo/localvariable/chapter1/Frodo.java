package com.core.jindo.localvariable.inheritance;

/**
 * @author ManhKM on 6/3/2022
 * @project Java-OCA
 */
public class Frodo extends Hobbit{
    public static void main(String[] args){
        int myGold = 7;
        System.out.println(countGold(myGold, 6));
    }
}

class Hobbit{
    static int countGold(int x, int y){
        return x + y;
    }
}
