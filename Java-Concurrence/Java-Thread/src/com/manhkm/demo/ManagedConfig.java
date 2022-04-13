package com.manhkm.demo;

import com.manhkm.demo.exception.ORMException;

/**
 * @author ManhKM on 3/7/2022
 * @project Java-Thread
 */
public interface ManagedConfig {
    void init() throws ORMException;
}
