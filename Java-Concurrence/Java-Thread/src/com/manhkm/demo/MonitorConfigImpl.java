package com.manhkm.demo;

import com.manhkm.demo.exception.ORMException;

/**
 * @author ManhKM on 3/7/2022
 * @project Java-Thread
 */
public class MonitorConfigImpl implements ManagedConfig{

    private MonitorConfig monitorConfig;
    @Override
    public void init() throws ORMException {
        Thread thread = new Thread(monitorConfig);
        thread.setName("Thread-MonitorConfig");
        thread.start();
    }
}
