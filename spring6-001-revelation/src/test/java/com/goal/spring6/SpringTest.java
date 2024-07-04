package com.goal.spring6;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SpringTest {

    @Test
    public void testInitBean() {

        new ClassPathXmlApplicationContext("spring.xml");

        Logger logger = LoggerFactory.getLogger(SpringTest.class);
        logger.info("普通信息");
        logger.debug("debug");
        logger.error("错误信息");

    }


    @Test
    public void xmlTest() throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml", "beans.xml");

        Date nowTime = context.getBean("nowTime", Date.class);
        System.out.println(nowTime);

    }

}
