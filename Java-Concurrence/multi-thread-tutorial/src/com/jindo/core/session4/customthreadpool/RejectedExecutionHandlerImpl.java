package com.jindo.core.session4.customthreadpool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ManhKM on 3/10/2023
 * @project multi-thread-tutorial
 */
public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

        System.out.println(r.toString() + " is rejected");
    }
}
