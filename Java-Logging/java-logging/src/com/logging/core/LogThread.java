package com.logging.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class LogThread extends Task{
    private final Logger logger = LogManager.getLogger(LogThread.class);
    @Override
    public Object call() throws Exception {
        List lstLog = getItems();
        try {
            if (lstLog != null && !lstLog.isEmpty()) {
                save(lstLog);
            }
        } catch (Exception e) {
            logger.error(e.toString(), e);
            return 0;
        }
        return 1;
    }

    public void save(List<Logs> lst) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            con = DatabaseUtils.getConnection();
            stmt = con.prepareStatement("INSERT INTO LOGS (LOGS_ID, LEVEL_LOG, CONTENT, CREATE_TIME)" +
                    " VALUES(LOGS_SEQ.NEXTVAL, ?, ?, SYSDATE)");
//            stmt = con.prepareStatement("INSERT INTO AD_SCHEDULE_LOG " +
//                    " (AD_SCHEDULE_LOG_ID, LEVEL_LOG, CONTENT, CREATE_TIME)" +
//                    " VALUES(AD_SCHEDULE_LOG_SEQ.NEXTVAL, ?, ?, SYSDATE)");
            for(Logs item : lst){
                stmt.setString(1, item.getLevelLog());
                stmt.setString(2, item.getContent());
                stmt.execute();
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        } finally {
            DatabaseUtils.closeObject(stmt);
            DatabaseUtils.closeObject(con);
        }
    }
}
