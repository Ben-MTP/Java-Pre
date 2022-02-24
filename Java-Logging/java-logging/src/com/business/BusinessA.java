package com.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class BusinessA {
    Logger logger = LogManager.getLogger(getClass());
    public BusinessA(){
        logger.info("Info From BusinessA");
        logger.warn("Warn From BusinessA");
        logger.error("Error From BusinessA");
    }
}
