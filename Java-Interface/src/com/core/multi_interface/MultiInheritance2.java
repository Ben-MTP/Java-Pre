package com.core.multi_interface;

/**
 * Bài toán:
 *      Nếu có một MultiInheritance -> kế thừa từ Parent
 *                                  -> implement Interface3
 *      ??? Thì nếu triển khai hàm doSomething thì chúng sẽ tìm ở đâu?
 *          Interface hay ParentClass.
 *          + Các method trong Interface sẽ bị bỏ qua
 *          + Sẽ triển khai trong các Parent Class.
 * @author ManhKM on 4/12/2022
 * @project Java-Interface
 */
public class MultiInheritance2 extends Parent implements Interface3{
    public static void main(String[] args) {
        MultiInheritance2 m = new MultiInheritance2();
        m.doSomething(); //????
    }
}
