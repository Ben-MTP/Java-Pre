package com.msoft.core.task;

import com.msoft.core.config.SqlUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
public class InsertData implements Runnable{
    private SqlUtility sqlUtility;

    @Override
    public void run() {

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO customers (name, address, productId) VALUES (?, ?, ?)";

        try{
            long time = System.currentTimeMillis();
            conn = this.sqlUtility.getConnection();
            conn.setAutoCommit(false);
            preparedStatement = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
