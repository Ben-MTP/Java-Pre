package com.msoft.core.repository;

import com.msoft.core.entity.Customer;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Repository
public class CustomerRepository {

    @Autowired
    private HikariDataSource dataSource;

    public void save(List<Customer> customers){
        String sql = "INSERT INTO customers (name, address, productId) VALUES (?, ?, ?)";

        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (Customer customer : customers) {
                preparedStatement.setString(1, customer.getName());
                preparedStatement.setString(2, customer.getAddress());
                preparedStatement.setInt(3, customer.getProductId());
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
            System.out.println("Save done: " + customers.size());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
