package com.msoft.core.task;

import com.msoft.core.entity.Customer;
import com.zaxxer.hikari.HikariDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Component
public class CustomerReader implements Runnable {
    private File file;

    public CustomerReader(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println("Start reading file " + file.getName());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int countLine = 0;

            while ((line = reader.readLine()) != null) {
                countLine++;
                String[] parts = line.split(",");

                int customerId = Integer.parseInt(parts[0]);
                String customerName = parts[1];
                String customerAddress = parts[2];
                int productId = Integer.parseInt(parts[3]);

                Customer customer = new Customer(customerId, customerName, customerAddress,
                        productId);
                System.out.println("File-name: " + file.getName() + ", index: " + countLine + ", "+customer);
            }
            System.out.println(
                    "---- Execute reader file: " + file.getName() + ", total row: " + countLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
