package com.logging;

import com.business.BusinessA;
import com.business.BusinessB;
import com.business.BusinessC;
import com.logging.core.DatabaseUtils;
import com.logging.core.Logs;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;


/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class Main {
    static Logger logger = LogManager.getLogger(com.business.Main.class);
    public static void main(String[] args) {
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        new BusinessA();
        new BusinessB();
        new BusinessC();

        Logs logs = new Logs();
        logs.setLevelLog("INFO");
        logs.setContent("Content");

        long start = new Date().getTime();
        com.logging.core.LogManager logManager = new com.logging.core.LogManager();
        logManager.listen();
        logManager.submit(logs);
        logger.info("Async: " + (new Date().getTime()-start) + "ms");
        start = new Date().getTime();
        new com.logging.Main().save(logs);

        logger.info("No-async: " + (new Date().getTime()-start) + "ms");
    }

    public void save(Logs item) {
        PreparedStatement stmt = null;
        Connection con = null;
        try {
            con = DatabaseUtils.getConnection();
            stmt = con.prepareStatement("INSERT INTO LOGS " +
                    " (LOGS_ID, LEVEL_LOG, CONTENT, CREATE_TIME)" +
                    " VALUES(LOGS_SEQ.NEXTVAL, ?, ?, SYSDATE)");
            stmt.setString(1, item.getLevelLog());
            stmt.setString(2, item.getContent());
            stmt.execute();
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        } finally {
            DatabaseUtils.closeObject(stmt);
            DatabaseUtils.closeObject(con);
        }
    }
}
