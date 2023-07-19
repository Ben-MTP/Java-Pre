package com.jindo.core.unchecked;

/**
 * Project: java-exception (>_<)/
 * Author: ManhKM as [ADMIN]
 * Date-Time: 7/19/2023-3:17 PM
 * Note: Nếu ngoại lệ trong m() không được xử lý, nó sẽ lan truyền đến method n() -> nếu nó cũng không được xử lý nữa thì sẽ lan truyền đến method p()
 */
public class TestExceptionPropagation {

    void m() {
        try {
            int data = 50 / 0;
        } catch (Exception e){
            System.out.println("Exception Handled in m() method");
        }
    }

    void n() {
        try {
            m();
        } catch (Exception e) {
            System.out.println("Exception Handled in n() method");
        }
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled in p() method");
        }
    }

    public static void main(String[] args) {
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}
