package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/15
 * @description TODO
 */
public class InfoTest {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(InfoTest.class);
        logger.info("hello info");
    }
}
