package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

// private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "daozhou";
        String passWord = "123456";
        log.info("name: {}, password: {}", name, passWord);

        log.debug("debug...");
        log.info("info...");
        log.error("error...");
        log.warn("warn...");
    }

}
