package com.core.jindo.localvariable.chapter1.ex10;

/**
 * @author ManhKM on 6/3/2022
 * @project Java-OCA
 */
public class Table extends Electronic implements Gadget{

    @Override
    public void doStuff() {
        System.out.println("show book ");
    }

    public static void main(String[] args) {
        new Table().getPower();
        new Table().doStuff();
    }
}
