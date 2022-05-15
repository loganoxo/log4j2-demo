package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/14
 * @description logger简单测试
 */
public class LoggerTest {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LoggerTest.class);
        //如果不加配置文件，默认的输出级别是 ERROR
        logger.error("hello1");

        // 日志级别为error时，不会输出info日志，但是someThing()会执行
        logger.info("hello2..{}", someThing(1));//会执行someThing()
        //懒惰输出日志
        if (logger.isInfoEnabled()) {
            logger.info("hello3..{}", someThing(2));//不会执行someThing()
        }
        //或者
        logger.info("hello4..{}", () -> someThing(3));//不会执行someThing()
    }

    public static String someThing(int i) {
        System.out.println("doing something" + i);
        return "world";
    }
}
