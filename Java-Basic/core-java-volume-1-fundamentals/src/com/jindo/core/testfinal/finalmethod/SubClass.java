package com.jindo.core.testfinal.finalmethod;

/**
 * @author ManhKM on 5/20/2022
 * @project core-java-volume-1-fundamentals
 * Cannot inherit from final 'com.jindo.core.testfinal.finalmethod.BaseClass'
 */
public class SubClass extends BaseClass{
    /**
     * 'makeNoise()' cannot override 'makeNoise()' in 'com.jindo.core.testfinal.finalmethod.BaseClass';
     * overridden method is final
     */
//    @Override
    public void makeNoise(String value){
        System.out.println("SubClass MakeNoise");
    }
}
