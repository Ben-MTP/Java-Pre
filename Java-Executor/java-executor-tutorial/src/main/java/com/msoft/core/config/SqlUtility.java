package com.msoft.core.config;

import com.msoft.core.utils.SQLUtils;
import com.msoft.core.utils.StringUtils;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Configuration("sqlUtility")
public class SqlUtility {

    public static final String PRIMARY_DATA_SOURCE = "primaryDataSource";
    private final HikariDataSource ds;
    private final Map<String, HikariDataSource> mapDS;
    private int refCursor;

    public SqlUtility(ApplicationContext context) {
        this.ds = (HikariDataSource) context.getBean(HikariDataSource.class);
        this.mapDS = context.getBeansOfType(HikariDataSource.class);
        if (this.ds instanceof HikariDataSource) {
            HikariDataSource hikari = this.ds;
            if (hikari.getDriverClassName().toLowerCase().contains("oracle")) {
                this.refCursor = -10;
            } else {
                this.refCursor = 2012;
            }
        } else {
            this.refCursor = 2012;
        }

    }

    public List<String> extractSQL(String sql) {
        return SQLUtils.extractSQL(sql);
    }

    public Map<String, String> toMap(ResultSet rs) throws SQLException {
        List<String> columnNames = this.extractRSMD(rs);
        Map<String, String> row = new HashMap();
        if (rs.next()) {
            Iterator var4 = columnNames.iterator();

            while (var4.hasNext()) {
                String columnName = (String) var4.next();
                row.put(columnName, rs.getString(columnName));
            }
        }

        return row;
    }

    public List<String> extractRSMD(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        List<String> columnNames = new ArrayList();

        for (int i = 1; i <= columnCount; ++i) {
            String columnName = "";

            try {
                columnName = rsmd.getColumnLabel(i);
            } catch (Exception var8) {
                columnName = rsmd.getColumnName(i);
            }

            columnNames.add(columnName.toUpperCase());
        }

        return columnNames;
    }

    public List<Map<String, String>> rsToListMap(ResultSet rs) throws SQLException {
        List<String> columnNames = this.extractRSMD(rs);
        ArrayList result = new ArrayList();

        while (rs.next()) {
            Map<String, String> row = new HashMap();
            Iterator var5 = columnNames.iterator();

            while (var5.hasNext()) {
                String columnName = (String) var5.next();
                row.put(columnName, rs.getString(columnName));
            }

            result.add(row);
        }

        return result;
    }

    public int executeDll(String dll) throws SQLException {
        Connection conn = null;

        int var3;
        try {
            conn = this.getConnection();
            var3 = this.executeDll(conn, dll);
        } finally {
            this.close(conn);
        }

        return var3;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public int executeDll(String dsName, String dll) throws SQLException {
        Connection conn = null;

        int var4;
        try {
            conn = this.getConnection(dsName);
            var4 = this.executeDll(conn, dll);
        } finally {
            this.close(conn);
        }

        return var4;
    }

    public int executeDllDS(String dsName, String dll) throws SQLException {
        Connection conn = null;

        int var4;
        try {
            conn = this.getConnection(dsName);
            var4 = this.executeDll(conn, dll);
        } finally {
            this.close(conn);
        }

        return var4;
    }

    public int executeDll(Connection conn, String dll) throws SQLException {
        Statement stmt = null;

        int var4;
        try {
            stmt = conn.createStatement();
            var4 = stmt.executeUpdate(dll);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception var11) {
                }
            }

        }

        return var4;
    }

    public List<Map<String, String>> toListMapFunc(String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        List var4;
        try {
            conn = this.getConnection();
            var4 = this.toListMapFunc(conn, sql, params);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception var11) {
                }
            }

        }

        return var4;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public List<Map<String, String>> toListMapFunc(String dsName, String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        List var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.toListMapFunc(conn, sql, params);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception var12) {
                }
            }

        }

        return var5;
    }

    public List<Map<String, String>> toListMapFuncDS(String dsName, String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        List var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.toListMapFunc(conn, sql, params);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception var12) {
                }
            }

        }

        return var5;
    }

    public List<Map<String, String>> toListMapFunc(Connection conn, String sql, Object... params)
            throws SQLException {
        CallableStatement cstmt = null;
        ResultSet rs = null;

        List var10;
        try {
            cstmt = conn.prepareCall(sql);
            cstmt.registerOutParameter(1, this.refCursor);
            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(1);
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; ++i) {
                    cstmt.setObject(i + 2, params[i]);
                }
            }

            cstmt.execute();
            rs = (ResultSet) cstmt.getObject(1);
            var10 = this.rsToListMap(rs);
        } finally {
            this.close(rs);
            this.close(cstmt);
        }

        return var10;
    }

    public List<Map<String, String>> toListMap(String sql, Object... params) throws SQLException {
        Connection conn = null;

        List var4;
        try {
            conn = this.ds.getConnection();
            var4 = this.toListMap(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var4;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public List<Map<String, String>> toListMap(String dsName, String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        List var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.toListMap(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var5;
    }

    public List<Map<String, String>> toListMapDS(String dsName, String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        List var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.toListMap(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var5;
    }

    public List<Map<String, String>> toListMap(Connection conn, String sql, Object... params)
            throws SQLException {
        PreparedStatement ptsm = null;
        ResultSet rs = null;

        List var10;
        try {
            ptsm = conn.prepareCall(sql);
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; ++i) {
                    ptsm.setObject(i + 1, params[i]);
                }
            }

            rs = ptsm.executeQuery();
            var10 = this.rsToListMap(rs);
        } finally {
            this.close(rs);
            this.close((PreparedStatement) ptsm);
        }

        return var10;
    }

    public Map<String, String> toMap(String sql, Object... params) throws SQLException {
        Connection conn = null;

        Map var4;
        try {
            conn = this.getConnection();
            var4 = this.toMap(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var4;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public Map<String, String> toMap(String dsName, String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        Map var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.toMap(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var5;
    }

    public Map<String, String> toMapDS(String dsName, String sql, Object... params)
            throws SQLException {
        Connection conn = null;

        Map var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.toMap(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var5;
    }

    public Map<String, String> toMap(Connection conn, String sql, Object... params)
            throws SQLException {
        PreparedStatement ptsm = null;
        ResultSet rs = null;

        Map var10;
        try {
            ptsm = conn.prepareCall(sql);
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; ++i) {
                    ptsm.setObject(i + 1, params[i]);
                }
            }

            rs = ptsm.executeQuery();
            var10 = this.toMap(rs);
        } finally {
            this.close(rs);
            this.close((PreparedStatement) ptsm);
        }

        return var10;
    }

    public String getValue(String sql, Object... params) throws SQLException {
        Connection conn = null;

        String var4;
        try {
            conn = this.getConnection();
            var4 = this.getValue(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var4;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public String getValue(String dsName, String sql, Object... params) throws SQLException {
        Connection conn = null;

        String var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.getValue(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var5;
    }

    public String getValueDS(String dsName, String sql, Object... params) throws SQLException {
        Connection conn = null;

        String var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.getValue(conn, sql, params);
        } finally {
            this.close(conn);
        }

        return var5;
    }

    public String getValue(Connection conn, String sql, Object... params) throws SQLException {
        PreparedStatement ptsm = null;
        ResultSet rs = null;

        String var10;
        try {
            ptsm = conn.prepareCall(sql);
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; ++i) {
                    ptsm.setObject(i + 1, params[i]);
                }
            }

            rs = ptsm.executeQuery();
            if (rs.next()) {
                var10 = rs.getString(1);
                return var10;
            }

            var10 = null;
        } finally {
            this.close(rs);
            this.close((PreparedStatement) ptsm);
        }

        return var10;
    }

    public int executeUpdate(String sql, Object... params) throws SQLException {
        Connection connection = null;

        int var4;
        try {
            connection = this.ds.getConnection();
            var4 = this.executeUpdate(connection, sql, params);
        } finally {
            this.closeAndCommit(connection);
        }

        return var4;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public int executeUpdate(String dsName, String sql, Object... params) throws SQLException {
        Connection connection = null;

        int var5;
        try {
            connection = this.getConnection(dsName);
            var5 = this.executeUpdate(connection, sql, params);
        } finally {
            this.closeAndCommit(connection);
        }

        return var5;
    }

    public int executeUpdateDS(String dsName, String sql, Object... params) throws SQLException {
        Connection connection = null;

        int var5;
        try {
            connection = this.getConnection(dsName);
            var5 = this.executeUpdate(connection, sql, params);
        } finally {
            this.closeAndCommit(connection);
        }

        return var5;
    }

    public int executeUpdate(Connection conn, String sql, Object... params) throws SQLException {
        CallableStatement pstmt = null;

        int i;
        try {
            pstmt = conn.prepareCall(sql);
            if (params != null && params.length > 0) {
                for (i = 0; i < params.length; ++i) {
                    pstmt.setObject(i + 1, params[i]);
                }
            }

            i = pstmt.executeUpdate();
        } finally {
            this.close((PreparedStatement) pstmt);
        }

        return i;
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }

    public Connection getConnection(String name) throws SQLException {
        if (StringUtils.isEmpty(name)) {
            return this.getConnection();
        } else {
            HikariDataSource ds = (HikariDataSource) this.mapDS.get(name);
            if (ds == null) {
                throw new NullPointerException("not found datasource name " + name);
            } else {
                return ds.getConnection();
            }
        }
    }

    public Set<String> getAllDsName() {
        return this.mapDS.keySet();
    }

    public Map<String, HikariDataSource> getMapDS() {
        return this.mapDS;
    }

    public String getValueFunc(String sql, Object... params) throws SQLException {
        Connection conn = null;

        String var4;
        try {
            conn = this.getConnection();
            var4 = this.getValueFunc(conn, sql, params);
        } finally {
            this.closeAndCommit(conn);
        }

        return var4;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public String getValueFunc(String dsName, String sql, Object... params) throws SQLException {
        Connection conn = null;

        String var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.getValueFunc(conn, sql, params);
        } finally {
            this.closeAndCommit(conn);
        }

        return var5;
    }

    public String getValueFuncDS(String dsName, String sql, Object... params) throws SQLException {
        Connection conn = null;

        String var5;
        try {
            conn = this.getConnection(dsName);
            var5 = this.getValueFunc(conn, sql, params);
        } finally {
            this.closeAndCommit(conn);
        }

        return var5;
    }

    public String getValueFunc(Connection conn, String sql, Object... params) throws SQLException {
        CallableStatement cstmt = null;

        String var9;
        try {
            cstmt = conn.prepareCall(sql);
            cstmt.registerOutParameter(1, 12);
            if (params != null && params.length > 0) {
                for (int i = 0; i < params.length; ++i) {
                    cstmt.setObject(i + 2, params[i]);
                }
            }

            cstmt.execute();
            var9 = cstmt.getString(1);
        } finally {
            this.close(cstmt);
        }

        return var9;
    }

    public void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception var3) {
            }
        }

    }

    public void closeAndCommit(Connection conn) {
        if (conn != null) {
            try {
                conn.commit();
            } catch (Exception var4) {
            }

            try {
                conn.close();
            } catch (Exception var3) {
            }
        }

    }

    public void close(CallableStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception var3) {
            }
        }

    }

    public void close(PreparedStatement pstmt) {
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (Exception var3) {
            }
        }

    }

    public void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception var3) {
            }
        }

    }
}
