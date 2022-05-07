package com.core.serializable.listobject;

import com.core.serializable.entity.Customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author ManhKM on 5/7/2022
 * @project Java-Serializable
 *
 * ----
 * Các logic liên quan với tập danh sách Customer:
 * 1. Tìm customer có số tuổi cao nhất.
 * 2. Đêm số lượng customer trong danh sách
 *
 */
public class ReadListObjectDemo {
    public static void main(String[] args) {
        FileInputStream readData = null;
        try {
            readData = new FileInputStream("src\\people.dat");
            ObjectInputStream readStream = new ObjectInputStream(readData);
            ArrayList<Customer> people2 = (ArrayList<Customer>) readStream.readObject();

            readStream.close();
            System.out.println(people2.toString());
            System.out.println("Danh sách customer trong file: " + people2.size());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
