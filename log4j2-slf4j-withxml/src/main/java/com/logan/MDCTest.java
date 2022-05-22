package com.logan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/22
 * @description TODO
 */
public class MDCTest {
    public static void main(String[] args) {
        MDC.put("traceId", "traceId");
        Logger logger = LoggerFactory.getLogger(MDCTest.class);
        logger.info("hello");
    }
}
