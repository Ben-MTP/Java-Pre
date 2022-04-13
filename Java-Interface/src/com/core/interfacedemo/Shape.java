package com.core.interfacedemo;

/**
 * Thực hiện khởi tạo một Interface Shape -> theo mô hình của Java 8
 *      + draw()
 *      + setColor() -> mặc khi setColor sẽ in ra...
 *          -> Khi implement lại Shape thì nó không bắt buộc phải implement default method.
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public interface Shape {
    void draw();

    default void setColor(String color){
        System.out.println("Draw shape with color: " + color);
    }
}
