package com.jindo.core.entity;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 */
public class TestCompany {
    public static void main(String[] args) {
        Manager boss = new Manager("ManhKM", 8000, 1996, 4, 30);
        boss.setBonus(500);

        Employee[] staff  = new Employee[3];
        staff[0] = boss;
        // staff[0].setBonus(1000);
        staff[1] = new Employee("Harry Hacker", 5000, 1997, 10, 1);
        Manager subBoss;
//        subBoss.setBonus(100);
//        staff[1] = subBoss;

        if(staff[1] instanceof  Manager){
            subBoss = (Manager) staff[1];
            subBoss.setBonus(100);
        }

        staff[2] = new Employee("Tony Tester", 4000, 1998, 3, 15);

        System.out.println("1. Member of company: ");
        for (Employee e : staff){
            System.out.println(e.getName() + " - " +e.getSalary());
        }

    }
}
