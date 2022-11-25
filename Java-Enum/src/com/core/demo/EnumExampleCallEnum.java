package com.core.demo;

/**
 * @author ManhKM on 4/20/2022
 * @project Java-Enum
 * -----
 * WeekDay là một kiểu Enum lưu giá trị các ngày trong tuần
 * Khi sử dụng lấy thông tin từ Enum ra ngoài:
 * Enum_name.gia_tri
 *
 */
public class EnumExampleCallEnum {
    public static void main(String[] args) {
        WeekDay d = WeekDay.MONDAY;
        System.out.println("EnumExampleCallEnum: " + d);
    }
}
