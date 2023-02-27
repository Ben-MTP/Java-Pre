package com.core.utils;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author ManhKM on 6/21/2022
 * @project Java-Utils
 */
public class ManageQueue {
    private ArrayDeque<Object> queue = new ArrayDeque<>();

    public boolean Add(ArrayList<Object> l, boolean isNotify){
        boolean is = false;
        try {
            synchronized (queue) {
                queue.addAll(l);
                if (isNotify) {
                    queue.notify();
                }
            }
            is = true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return is;
    }

    public boolean Add(Object o, boolean isNotify) {
        boolean is = false;
        try {
            synchronized (queue) {
                queue.add(o);
                if (isNotify) {
                    queue.notify();
                }
            }
            is = true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return is;
    }

    public void reAdd(ArrayList<Object> l) {
        try {
            synchronized (queue) {
                queue.addAll(l);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void reAdd(Object o) {
        try {
            synchronized (queue) {
                queue.add(o);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void waitQueue(int time_out) {
        try{
            if (queue.isEmpty()) {
                synchronized (queue) {
                    queue.wait(time_out);
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void waitNew(int time_out) {
        try{
            synchronized (queue) {
                queue.wait(time_out);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    //Get Queue:
    public ArrayList<Object> getQueue(int max) {
        ArrayList<Object> l = new ArrayList<Object>();
        try{
            if (queue.isEmpty()) return l;
            int n = 0;
            synchronized (queue) {
                while (!queue.isEmpty() && n < max) {
                    n ++;
                    Object o = queue.remove();
                    if (o!=null) l.add(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return l;
    }

    public int getSize() {
        return queue.size();
    }


}
