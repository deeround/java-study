package com.wang;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class Springboot01HelloworldApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void contextLoads() {
        logger.trace("这是trace日志......");
        logger.debug("这是debug日志......");
        logger.info("这是info日志......");
        logger.warn("这是warn日志......");
        logger.error("这是error日志......");
    }

}
