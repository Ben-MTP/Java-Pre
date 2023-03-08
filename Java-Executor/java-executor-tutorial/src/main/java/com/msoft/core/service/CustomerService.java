package com.msoft.core.service;

import com.msoft.core.entity.Customer;
import com.msoft.core.repository.CustomerRepository;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @author ManhKM on 3/8/2023
 * @project java-executor-tutorial
 */
@Service
public class CustomerService {

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    private CustomerRepository repository;

    public void loadCustomersFromFiles(String dataDirectory) {
        File directory = new File(dataDirectory);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        for (File file : files) {
            taskExecutor.execute(() -> {
                System.out.println("Current execute file: " + file.getName());
                List<Customer> customers = readCustomersFromList(file);
                saveCustomersToDatabase(customers);
            });
        }
    }

    private void saveCustomersToDatabase(List<Customer> customers) {
        repository.save(customers);
    }

    private List<Customer> readCustomersFromList(File file) {
        List<Customer> customers = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                Customer customer = new Customer(Integer.parseInt(fields[0]), fields[1], fields[2],
                        Integer.parseInt(fields[3]));
                customers.add(customer);
            }
            reader.close();
            return customers;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
