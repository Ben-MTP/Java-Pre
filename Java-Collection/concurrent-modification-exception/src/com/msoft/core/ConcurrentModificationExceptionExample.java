package com.msoft.core;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/**
 * @author ManhKM on 11/25/2022
 * @project concurrent-modification-exception
 */
public class ConcurrentModificationExceptionExample {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // Thêm phần tử cho collection:
        for (int i = 0; i < 20; i++){
            myList.add(String.valueOf(i));
        }

        // Duyệt Collection và xóa theo điều kiện:
        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            String value = null;
            try{
                value = it.next();
            } catch (ConcurrentModificationException e){
                System.out.println(e);
            }
            System.out.println("List value: " + value);
            if (value.equals("3")){
                myList.remove(value);
            }
        }



    }
}
