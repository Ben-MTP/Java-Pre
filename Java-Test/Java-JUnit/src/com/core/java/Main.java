package com.core.java;

import com.core.java.entity.TamGiac;
import com.core.java.services.ILogic;
import com.core.java.services.impl.LogicImpl;

/**
 * @author ManhKM on 4/29/2022
 * @project Java-JUnit
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra tính đúng đắn của tam giác: ");
        ILogic business = new LogicImpl();
        TamGiac tamGiac = new TamGiac(9,5,7);
        /**
         * Tính chu vi tam giác
         * Tính diện tích tam giác
         */
        System.out.println("Chu vi tam giác: " + business.chuvi(tamGiac));
        System.out.println("Diện tích tam giác: " + business.dientich(tamGiac));
    }
}
