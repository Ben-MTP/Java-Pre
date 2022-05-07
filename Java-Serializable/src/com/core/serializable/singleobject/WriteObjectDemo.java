package com.core.serializable.singleobject;

import com.core.serializable.entity.Customer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ManhKM on 4/13/2022
 * @project Java-Serializable
 * -----
 * ObjectOutputStream -> FileOutputStream -> File
 */
public class WriteObjectDemo {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
             oos = new ObjectOutputStream(
                     new FileOutputStream(
                             new File("src\\customer.dat")));
             Customer cus1 = new Customer(1L, "manhkm", 18, "Thai Binh");

            System.out.println("Customer before serialization");
            /**
             * Ghi ra file để lưu giữ liệu của Customer
             * Dữ liệu ra file rồi có thể đọc lại chúng
             * Trường hợp 1: Nếu file đó có dữ liệu đơn
             * Trường hợp 2: Nếu file đó là tập một Collection về dữ liệu
             */
            oos.writeObject(cus1);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
