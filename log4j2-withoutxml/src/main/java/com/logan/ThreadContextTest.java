package com.logan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/14
 * @description 提供web服务时，多个线程的日志混杂在一起，不好看，用以下方式解决，通常用在拦截器或者过滤器里面
 */
public class ThreadContextTest {
    private static final Logger log = LogManager.getLogger(ThreadContextTest.class);

    public static void main(String[] args) {
        ThreadContext.put("name", "logan");
        ThreadContext.put("desc", "测试");
        log.error("hello");
        ThreadContext.clearAll();

    }


}
