package com.business;

import com.logging.core.DatabaseUtils;
import com.logging.core.Logs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class Main {
    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        new BusinessA();
        new BusinessB();
        new BusinessC();
    }
}
