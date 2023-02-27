package com.jindo.core.entity;

import com.jindo.core.entity.Person;
import com.jindo.core.interfacex.ComparableT;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 */
public class Employee extends Person implements Comparable, ComparableT<Employee> {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name){
        super(name);
    }

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }



    /**
     * method getName -> trả về name của Employee
     * B1: Lúc khởi tạo Construct -> call supper -> Person
     * B2: Lúc lấy ra thì cũng phải lấy từ supper -> Person
     */
    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return "an employee with a salary of " + getSalary();
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

    /**
     * Bổ sung phương thức so sánh giữa các Object
     * @param otherObject
     * @return
     */
    public boolean equals(Object otherObject){
        if(this == otherObject){
            return true;
        }

        if(otherObject == null){
            return false;
        }

        if(getClass() != otherObject.getClass()){
            return false;
        }

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public int compareTo(Object otherObject) {
        Employee other = (Employee) otherObject;
        return Double.compare(salary, other.salary);
    }

    @Override
    public int compareToT(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
