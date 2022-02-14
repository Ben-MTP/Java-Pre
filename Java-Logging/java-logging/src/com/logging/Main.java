package com.logging;

import com.business.BusinessA;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * @author ManhKM on 2/14/2022
 * @project java-logging
 */
public class Main {
    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        BusinessA businessA = new BusinessA();
    }
}
