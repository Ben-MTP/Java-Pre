package com.jindo.core.entity.inheritance;

import com.jindo.core.entity.Person;

import java.time.LocalDate;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 */
public class Employee extends Person {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return null;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    /**
     * Tăng lương
     * @param byPercent -> tỷ lệ nâng lương
     */
    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
