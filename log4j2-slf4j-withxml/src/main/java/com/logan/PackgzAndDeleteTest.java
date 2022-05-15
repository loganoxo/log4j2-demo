package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/15
 * @description 测试日志打包 和 定期删除旧日志
 */
public class PackgzAndDeleteTest {
    public static void main(String[] args) throws IOException {
        Logger logger = LogManager.getLogger(PackgzAndDeleteTest.class);
        for (int i = 0; i < 100; i++) {
            logger.error("测试日志打包 和 定期删除旧日志" + i);
        }
    }

}
