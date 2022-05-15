package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/15
 * @description 不会打印
 */
public class TraceTest2 {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(TraceTest2.class);
        logger.trace("test22");
    }
}
