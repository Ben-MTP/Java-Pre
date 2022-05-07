package com.core.serializable.singleobject;

import com.core.serializable.entity.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Thực hiện việc đọc dữ liệu từ file: customer.dat -> và lấy vào trong chương trình.
 *
 * Chưa đọc được dữ liệu một List từ file dat lên chương trình.
 * ObjectInputStream -> FileInputStream -> File
 * @author ManhKM on 4/13/2022
 * @project Java-Serializable
 */
public class ReadObjectDemo {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream(
                            new File("src\\customer.dat")));
            System.out.println("Customer after deserialization: ");
            Customer customer = (Customer) ois.readObject();
            System.out.println(customer);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
