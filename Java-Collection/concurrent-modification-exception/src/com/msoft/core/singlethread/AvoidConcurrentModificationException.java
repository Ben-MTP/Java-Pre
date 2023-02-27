package com.msoft.core.singlethread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sun.awt.image.ImageWatched.Link;

/**
 * @author ManhKM on 11/25/2022
 * @project concurrent-modification-exception
 */
public class AvoidConcurrentModificationException {

  public static void main(String[] args) {

    List<String> myList = new CopyOnWriteArrayList<>();
//    List<String> myList = new LinkedList<>();

    for (int i = 1; i <= 5; i++){
      myList.add(String.valueOf(i));
    }

    for (int i = 0; i < myList.size(); i++){
      System.out.println(myList.get(i));
      if (myList.get(i).equals("3")){
        myList.remove(i);
        i--;
        myList.add("6");
      }
    }
  }
}
