package com.woniu.aw.springboot.jgdt.controller;

/**
 * @Author: LDL
 * @CreateTime: 2023-11-09  15:51
 * @Description: TODO
 * @Version: 1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志测试类
 */
@Slf4j
public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void logTestOut() {
        for (int i = 0; i < 10000; i++) {
            logger.info("org.slf4j.Logger输出");
            log.info("lombok.extern.slf4j.Slf4j包下日志输出");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            logTestOut();
            Thread.sleep(5 * 1000);
        }
    }

}


