package com.logan;

import org.apache.logging.log4j.EventLogger;
import org.apache.logging.log4j.message.StructuredDataMessage;

import java.util.UUID;

/**
 * @author logan
 * @version 1.0
 * @date 2022/5/14
 * @description EventLogger使用一个名为“EventLogger”的Logger。EventLogger默认使用OFF的日志级别以暗示它不会被过滤。
 */
public class EventLogTest {
    public static void main(String[] args) {
        String confirm = UUID.randomUUID().toString().substring(0, 32);
        StructuredDataMessage msg = new StructuredDataMessage(confirm, null, "transfer");
        msg.put("toAccount", "1");
        msg.put("fromAccount", "2");
        msg.put("amount", "3");
        EventLogger.logEvent(msg);
    }
}
