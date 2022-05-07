package com.core.java.services.impl;

import com.core.java.entity.TamGiac;
import com.core.java.services.ILogic;

/**
 * @author ManhKM on 4/29/2022
 * @project Java-JUnit
 */
public class LogicImpl implements ILogic {

    @Override
    public boolean check(TamGiac tamGiac) {
        if(tamGiac.getCanh1() + tamGiac.getCanh2() > tamGiac.getCanh3()){
            return true;
        } else if (tamGiac.getCanh1() + tamGiac.getCanh3() > tamGiac.getCanh2()){
            return true;
        } else if (tamGiac.getCanh2() + tamGiac.getCanh3() > tamGiac.getCanh1()){
            return true;
        } else
            return false;
    }

    @Override
    public int chuvi(TamGiac tamGiac) {
        if(!check(tamGiac)){
            System.out.println("Tam giác không hợp lệ");
            return -1;
        } else {
            int chuvi = tamGiac.getCanh1() + tamGiac.getCanh2() + tamGiac.getCanh3();
            System.out.println("Tam giác hợp lệ");
            return chuvi;
        }
    }

    @Override
    public float dientich(TamGiac tamGiac) {
        if(!check(tamGiac)){
            System.out.println("Tam giác không hợp lệ");
            return -1;
        } else {
            System.out.println("Tam giác hợp lệ");
            /**
             * Dựa vào công thức Heron:
             */
            float nuaChuVi = (float) ((chuvi(tamGiac)*1.0) / 2);
            float dienTich = (float) Math.sqrt(nuaChuVi
                    *(nuaChuVi-tamGiac.getCanh1()*1.0)
                    *(nuaChuVi-tamGiac.getCanh2()*1.0)
                    *(nuaChuVi- tamGiac.getCanh3()*1.0));
            return dienTich;
        }
    }
}
