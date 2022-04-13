package com.core.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 4/13/2022
 * @project Java-Serializable
 */
public class WriteObjectDemo {
    public static void main(String[] args) {
        List<Customer> listData = new ArrayList<>();
        ObjectOutputStream oos = null;
        try {
             oos = new ObjectOutputStream(new FileOutputStream(new File("src\\customer.dat")));
             Customer cus1 = new Customer(1L, "manhkm", 18, "Thai Binh");
             Customer cus2 = new Customer(2L, "hieuvt", 18, "Hung Yen");
             Customer cus3 = new Customer(3L, "thanglv", 18, "Vinh Phuc");
             Customer cus4 = new Customer(4L, "trangtt", 18, "Ha Nam");

             listData.add(cus1);
             listData.add(cus2);
             listData.add(cus3);
             listData.add(cus4);

            System.out.println("Customer before serialization");
            for (Customer item : listData) {
                System.out.println(item.toString());
                /**
                 * method writeObject -> kiểm tra đối tượng có phải là serializable không
                 * Sau đó sẽ chuyển thành byte -> thực hiện ghi xuống
                 */
                oos.writeObject(item);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
