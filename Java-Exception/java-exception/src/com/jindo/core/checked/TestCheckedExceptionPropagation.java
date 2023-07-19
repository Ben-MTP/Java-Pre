package com.jindo.core.checked;

import java.io.IOException;

/**
 * Project: java-exception (>_<)/
 * Author: ManhKM as [ADMIN]
 * Date-Time: 7/19/2023-3:22 PM
 * Note: Nếu cứ throws mãi mà không ai bắt thì sẽ gây lỗi chương trình
 */
public class TestCheckedExceptionPropagation {

    void m() throws IOException {
        // Nếu không bắt Exception mà trả về throws thì n() phải bắt
        throw new IOException("Device error/method m()");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e){
            System.out.println("Exception when execute method m(): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        TestCheckedExceptionPropagation obj = new TestCheckedExceptionPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}
