package com.msoft.core;

import com.msoft.core.monitor.FileWatcher;
import com.msoft.core.monitor.impl.FileWatcherImpl;

public class MonitorFile {
    public static void main(String[] args) {
        System.out.println("----- MONITOR FILE -----");
        FileWatcher fileWatcher = new FileWatcherImpl();

        fileWatcher.run();
    }
}
