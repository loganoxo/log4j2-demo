package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/14
 * @description 测试对这个类单独设置打印级别，会打印，但是不会输出到三个级别对应的的RollingFile的日志文件中，因为RollingFile中也对级别做了判断
 */
public class TraceTest1 {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(TraceTest1.class);
        logger.trace("test22");
    }
}
