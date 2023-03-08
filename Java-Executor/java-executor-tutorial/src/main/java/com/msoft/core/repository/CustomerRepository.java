package com.msoft.core.repository;

import com.msoft.core.entity.Customer;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Repository
public interface CustomerRepository {

    void insertData(Customer customer);
}
