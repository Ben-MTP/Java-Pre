package com.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class BusinessC {
    Logger logger = LogManager.getLogger(getClass());
    public BusinessC(){
        logger.info("Info From BusinessC");
        logger.warn("Warn From BusinessC");
        logger.error("Error From BusinessC");
    }
}
