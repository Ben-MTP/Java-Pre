package com.msoft.core.monitor;

import java.util.Map;

public interface FileWatcher extends Runnable{

    Map<String, Long> getFileMonitor(String pathDirectory);
}
