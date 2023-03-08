package com.jindo.core.session1.priority;

/**
 * @author ManhKM on 3/8/2023
 * @project multi-thread-tutorial
 */
public class WorkingThread extends Thread{

    private Thread t;
    private String name;

    WorkingThread(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running " + name);
        for (int i = 0; i < 10; i++){
            System.out.printf("Luồng: %s có độ ưu tiên là %d \n", this.getName(), this.getPriority());
        }
    }

    public void start(){
        System.out.println("Starting " + name);
        if(t == null){
            t = new Thread(this, this.name);
            t.start();
        }
    }
}
