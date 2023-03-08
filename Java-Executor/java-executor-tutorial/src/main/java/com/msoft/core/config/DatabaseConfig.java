package com.msoft.core.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Configuration
public class DatabaseConfig {

    @Bean
    public HikariDataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/example");
        config.setUsername("root");
        config.setPassword("12345678aA");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }
}
