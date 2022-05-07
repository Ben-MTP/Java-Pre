package com.reflect;

import java.lang.reflect.Field;

/**
 * @author ManhKM on 4/23/2022
 * @project Java-Reflection
 */
public class Girl {
    private String name;

    public Girl() {

    }

    public Girl(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Girl girl = new Girl(); // KHởi tạo đối tượng Girl
        girl.setName("Ngoc trinh");

        // Lay ra tat ca field cua object
        // Chỉ để bạn xem ví dụ thôi, bỏ qua phần này nhé!
        for(Field field : girl.getClass().getDeclaredFields()){
            System.out.println();
            System.out.println("Field: " +field.getName());
            System.out.println("Type: " +field.getType());
        }

        // PHẦN CHÍNH
        Field nameField = girl.getClass().getDeclaredField("name"); // Lấy ra field có tên "name" (nếu không tìm thấy, nó sẽ bắn NoSuchFieldException)
        nameField.setAccessible(true); // Cho phép truy cập tạm thời. (Vì nó đang là Private mà)

        // Bây giờ cái "nameField" đại diện cho thuộc tính "name" của mọi object có class Girl.
        nameField.set(girl, "Bella"); // thay giá trị mới của `girl` bằng nameField.


        System.out.println(girl);
    }
}
