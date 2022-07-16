package com.core.serializable.listobject;

import com.core.serializable.entity.Customer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ManhKM on 7/16/2022
 * @project Java-Serializable
 * -----
 * Thực hiên việc mã hóa thông tin của Customer xuống file customer.ser
 * Quá trình Serial thực hiện chính việc mã hóa này.
 */
public class SerializeCustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Khổng Minh Mạnh");
        customer.setAge(18);
        customer.setAddress("Thái Bình, Việt Nam");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("tmp/customer.ser");       //Thực hiện tạo thư mục tmp/
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customer);
            objectOutputStream.close();

            System.out.println("Dữ liệu sau Serialized được tại: tmp/customer.ser");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
