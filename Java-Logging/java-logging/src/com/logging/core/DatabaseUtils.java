package com.logging.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class DatabaseUtils {
    static Logger logger = LogManager.getLogger(DatabaseUtils.class);
    private static Connection conn;

    public static Connection getConnection() throws SQLException,
            ClassNotFoundException {
        if (conn!=null && !conn.isClosed()){
            return conn;
        }
        String userName = "corebasic";
        String password = "corebasic";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String connectionURL = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =  (ADDRESS = (PROTOCOL = TCP)(HOST = localhost)(PORT = 1521)))(CONNECT_DATA = (SERVICE_NAME = orcl12c) (SERVER = DEDICATED)))";
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }

    public static void closeObject(Statement obj) {
        try {
            if (obj != null) { obj.close(); }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

    public static void closeObject(ResultSet obj) {
        try {
            if (obj != null) {  obj.close(); }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

    public static void closeObject(Connection obj) {
        try {
            if (obj != null && !obj.isClosed()) {
                if (!obj.getAutoCommit()) { obj.rollback(); }
                obj.close();
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

}
