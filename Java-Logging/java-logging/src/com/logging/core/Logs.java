package com.logging.core;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class Logs {
    private Integer logsId;
    private String levelLog;
    private String content;

    public Integer getLogsId() {
        return logsId;
    }

    public void setLogsId(Integer logsId) {
        this.logsId = logsId;
    }

    public String getLevelLog() {
        return levelLog;
    }

    public void setLevelLog(String levelLog) {
        this.levelLog = levelLog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
