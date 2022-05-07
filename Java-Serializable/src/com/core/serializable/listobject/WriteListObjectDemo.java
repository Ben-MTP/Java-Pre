package com.core.serializable.listobject;
import com.core.serializable.entity.Customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 5/7/2022
 * @project Java-Serializable
 */
public class WriteListObjectDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(1L, "ManhKM", 18, "Ha Noi");
        Customer customer1 = new Customer(2L, "TrangKT", 18, "Ha Noi");
        Customer customer2 = new Customer(3L, "TrangTT", 18, "Ha Noi");
        Customer customer3 = new Customer(4L, "Haha", 18, "Ha Noi");
        Customer customer4 = new Customer(5L, "hihi", 18, "Ha Noi");

        List<Customer> people = new ArrayList();
        people.add(customer);
        people.add(customer1);
        people.add(customer2);
        people.add(customer3);
        people.add(customer4);

        FileOutputStream writeData = null;
        try {
            writeData = new FileOutputStream("src\\people.dat");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(people);
            writeStream.flush();
            writeStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
