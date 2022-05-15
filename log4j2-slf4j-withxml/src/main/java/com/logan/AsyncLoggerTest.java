package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/15
 * @description TODO
 */
public class AsyncLoggerTest {
    public static void main(String[] args) {
        Logger logger1 = LogManager.getLogger(AsyncLoggerTest.class);
        Logger logger2 = LogManager.getLogger("ASYNSTDOUT2");//原生异步日志
        Logger logger3 = LogManager.getLogger("root");//同步日志
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            logger1.info("时间戳1：{}", System.currentTimeMillis());
        }
        long end = System.currentTimeMillis();
        logger2.info("时间经历了：" + (end - start) + "ms");
        /*
         * 同步日志打印时间经过 5542ms
         * AsyncLogger时间经过 251ms
         * 原生异步日志 经过 82ms
         * */
    }
}
