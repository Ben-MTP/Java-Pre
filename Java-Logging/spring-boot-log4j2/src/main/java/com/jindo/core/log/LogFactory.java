package com.jindo.core.log;


import org.apache.log4j.Logger;

/**
 * @author ManhKM on 9/5/2022
 * @project spring-boot-log4j2
 */
public class LogFactory {

    public static Logger getLogger(){

        Logger logger = Logger.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());

        return logger;
    }
}
