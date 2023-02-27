package com.jindo.core.interfacex;

/**
 * @author ManhKM on 5/25/2022
 * @project core-java-volume-1-fundamentals
 */
interface Named {
    default String getName(){
        return getClass().getName() + " - " + hashCode();
    }
}
