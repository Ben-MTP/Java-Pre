package com.javabasic.pojo;

/**
 * @author ManhKM on 1/21/2022
 * @project Java-POJO
 * Properties in class POJO:
 * 1. The POJO class phải là public
 * 2. Phải có default constructor
 * 3. Nó có thể có constructor có tham số.
 * 4. Tất cả các Object phải có public Getter/Getter để truy cập đến giá trị của Object.
 * 5. Object trong POJO Class có thể có các phạm vi truy cập: private, public, protected, default.
 * 6. Tất các các instance nên được private nhắm nâng cao bảo mật liên quan đến Object. (for V  --> để làm gì đó)
 * 7. Một POJO class không extend từ class trước đó.
 * 8. Một POJO class không triển khai lại một interface trước đó -> implement interface.
 * 9. Một POJO class không có Annotation.
 */
public class Employee {
    private String name;
    private int id;
    private int sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
