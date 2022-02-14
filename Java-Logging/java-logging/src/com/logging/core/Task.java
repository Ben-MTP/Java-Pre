package com.logging.core;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public abstract class Task<E> implements Callable<Integer> {
    private List<E> items;
    public void setItems(List<E> items){
        this.items = items;
    }
    public List<E> getItems(){
        return items;
    }
}