package com.core.serializable.single;

import com.core.serializable.entity.Customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ManhKM on 5/6/2022
 * @project Java-Serializable
 */
public class SerializationExample {
    public static void main(String[] args) {
        Customer customer = new Customer(1L, "ManhKM", 18, "Ha Noi");
        try {
            FileOutputStream fos = new FileOutputStream("E:\\1_CODING\\LearnJava\\Java-Pre\\Java-Serializable\\data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customer);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
