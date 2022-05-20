package com.jindo.core.inte;

/**
 * @author ManhKM on 5/16/2022
 * @project java-oop
 * -----
 * Có con thì bay -> nó cũng là một loại từ Action
 */
public interface IFly extends IAct {
    @Override
    void running(String style);
}
