package com.juniter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        int i = 0;
        while (++i < 100000)
            logger.info("日志测试程序",i);
    }
}
