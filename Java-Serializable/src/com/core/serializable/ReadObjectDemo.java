package com.core.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Thực hiện việc đọc dữ liệu từ file: customer.dat -> và lấy vào trong chương trình.
 *
 * Chưa đọc được dữ liệu một List từ file dat lên chương trình
 * @author ManhKM on 4/13/2022
 * @project Java-Serializable
 */
public class ReadObjectDemo {
    public static void main(String[] args) {
        List<Customer> listData = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream(
                            new File("src\\customer.dat")));
            System.out.println("Customer after deserialization: ");
            listData = (List<Customer>) ois.readObject();

            for (Customer item : listData) {
                System.out.println(item.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
