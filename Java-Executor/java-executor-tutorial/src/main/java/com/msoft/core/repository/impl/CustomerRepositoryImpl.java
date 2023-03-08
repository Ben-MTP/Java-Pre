package com.msoft.core.repository.impl;

import com.msoft.core.entity.Customer;
import com.msoft.core.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertData(Customer customer) {
        String sql = "INSERT INTO customers (name, address, product_id) VALUES (?, ?, ?)";
        System.out.println(customer);
        jdbcTemplate.update(sql, customer.getName(), customer.getAddress(), customer.getProductId());
    }
}
