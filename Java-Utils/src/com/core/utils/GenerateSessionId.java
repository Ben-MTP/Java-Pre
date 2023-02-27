package com.core.utils;

import java.util.Random;

/**
 * @author ManhKM on 6/20/2022
 * @project Java-Utils
 */
public class GenerateSessionId {
    private static String arrInt = "0123456789";//012345678901234567890123456789

    //Ham tra ra 1 so Random theo Id de lam ma giao dich:
    public static String genSessionId(String prefix, int length) {
        StringBuilder str = new StringBuilder(prefix);
        System.out.println("nanoTime(): "+str.append(System.nanoTime()));
        try {
            Random rd = new Random();
            for (int i = 15; i < length; i++) {
                str.append(arrInt.charAt(rd.nextInt(10)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(genSessionId("NEO", 30));
        }
    }
}
