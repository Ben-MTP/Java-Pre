package com.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class BusinessB {
    Logger logger = LogManager.getLogger(getClass());
    public BusinessB(){
        logger.info("Info From BusinessB");
        logger.warn("Warn From BusinessB");
        logger.error("Error From BusinessB");
    }
}
