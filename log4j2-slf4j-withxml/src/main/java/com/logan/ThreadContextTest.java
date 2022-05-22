package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/22
 * @description TODO
 */
public class ThreadContextTest {
    private static final Logger log = LogManager.getLogger(ThreadContextTest.class);

    public static void main(String[] args) {
        ThreadContext.put("traceId", "traceId");
        ThreadContext.put("desc", "测试");
        log.info("hello");
        ThreadContext.clearAll();

    }
}
