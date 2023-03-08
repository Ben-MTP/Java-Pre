package com.msoft.core.task;

import java.io.File;
import java.util.concurrent.Executor;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
public class CustomerProcessor {

    private Executor executor;

    public CustomerProcessor(Executor executor){
        this.executor = executor;
    }

    public void process(String directory){
        File dir = new File(directory);
        if(dir.isDirectory()){
            File[] files = dir.listFiles((dir1, name) -> name.toLowerCase().endsWith(".txt"));
            System.out.println("Total file in /data: " + files.length);
            if (files != null){
                for (File file : files){
                    executor.execute(new CustomerReader(file));
                }
            }
        }
    }
}
