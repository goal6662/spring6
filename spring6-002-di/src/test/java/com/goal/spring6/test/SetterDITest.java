package com.goal.spring6.test;

import com.goal.spring6.dao.OrderDao;
import com.goal.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDITest {

    @Test
    public void outerDITest() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("set-di.xml");

        OrderService orderService = context.getBean("orderServiceInner", OrderService.class);
        orderService.generate();
    }

}
