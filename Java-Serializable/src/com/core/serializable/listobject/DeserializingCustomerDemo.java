package com.core.serializable.listobject;

import com.core.serializable.entity.Customer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author ManhKM on 7/16/2022
 * @project Java-Serializable
 */
public class DeserializingCustomerDemo {
    public static void main(String[] args) {
        Customer customer = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("tmp/customer.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // kết quả trả về của readObject() được tham chiếu đến Object Customer:
            customer = (Customer) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

        } catch (IOException e){
            System.out.println("Không tìm thấy file tmp/customer.ser");
        } catch (ClassNotFoundException e){
            System.out.println("Không tìm thấy class Customer");
        }

        System.out.println("Deserialized Customer: ...");
        System.out.println("ID: " + customer.getId());
        System.out.println("NAME: " + customer.getName());
        System.out.println("AGE: " + customer.getAge());
        System.out.println("ADDRESS: " + customer.getAddress());

        System.out.println("Gửi email đến: " + customer.getName());
        customer.mailCheck();

    }
}
