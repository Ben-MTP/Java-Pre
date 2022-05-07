package com.core.java.services;

import com.core.java.entity.TamGiac;

/**
 * @author ManhKM on 4/29/2022
 * @project Java-JUnit
 */
public interface ILogic {
    boolean check(TamGiac tamGiac);
    int chuvi(TamGiac tamGiac);
    float dientich(TamGiac tamGiac);
}
