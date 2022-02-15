package com.manhkm.schedule;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 2/15/2022
 * @project spring-scheduler
 */
public abstract class ScheduleManager {
    Logger logger = LoggerFactory.getLogger(getClass());
    private String scheduleCode;
    private Map params = new HashMap();
    public ScheduleManager(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        this.process();
    }

    /**
     * Load tham số nghiệp vụ từ DB
     */
    protected void loadParametersFromDB() {
        logger.info("Start load parameters from DB for " + this.scheduleCode);
        //Load cấu hình tham số nghiệp vụ cho tiến trình từ DB theo scheduleCode
        //Fill danh sách tham số vào this.params
    }

    /**
     * Validate tham số trước khi chạy
     * @return
     * @throws Exception
     */
    private boolean validate() throws Exception {
        logger.info("Validate parameter for " + this.scheduleCode);
        return validateParameters();
    }

    /**
     * Dành cho tiến trình implement các khởi tạo tham số
     */
    protected abstract void initParameters();

    /**
     * Dành cho tiến trình implement các validate nghiệp vụ
     * @return
     * @throws Exception
     */
    protected abstract boolean validateParameters() throws Exception;

    /**
     * Dành cho tiến trình implement nghiệp vụ cụ thể
     * @throws Exception
     */
    protected abstract void run() throws Exception;

    /**
     * Hàm xử lý chính của khung tiến trình
     */
    private void process() {
        long start = new Date().getTime();
        logger.info("START " + this.scheduleCode);
        try {
            loadParametersFromDB();
            initParameters();
            if (validate()) {
                logDebug("Loaded params and running");
                run();
                logDebug("Done in " + (new Date().getTime() - start) + "ms");
            } else {
                logDebug("Loaded params and not running");
            }
        } catch (Exception e) {
            logger.error(this.scheduleCode + ": " + e.toString(), e);
            logError(e.toString());
        } finally {
            logger.info("END " + this.scheduleCode + " in " + (new Date().getTime() - start) + "ms");
        }
    }

    protected final void addParam(String key, Object value) {
        if (this.params == null) {
            this.params = new HashMap();
        }
        this.params.put(key, value);
    }

    protected final Object getParam(String key) {
        if (this.params == null) {
            return null;
        }
        return this.params.get(key);
    }

    protected final String getParamAsString(String key, String defaultValue) {
        Object value = getParam(key);
        return value==null?defaultValue:value.toString();
    }

    protected final Integer getParamAsInteger(String key, Integer defaultValue) {
        String ret = getParamAsString(key, null);
        if (ret == null) {
            return defaultValue;
        }
        try {
            return Integer.valueOf(ret);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    protected final Map getAllParams() {
        return this.params == null ? new HashMap() : this.params;
    }

    protected void logDebug(String content) {
        logger.debug(content);
    }

    protected void logInfo(String content) {
        logger.info(content);
    }

    protected void logError(String content) {
        logger.error(content);
    }
}
