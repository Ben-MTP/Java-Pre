package com.jindo.core.entity;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 * -----
 * Giám đốc:
 * + Từ khóa final: Đánh dấu class này không thể kế thừa từ một sub-class nào nữa
 */
public final class Executive extends Manager{
    public Executive(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }
}
