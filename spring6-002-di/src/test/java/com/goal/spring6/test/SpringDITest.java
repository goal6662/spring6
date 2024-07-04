package com.goal.spring6.test;

import com.goal.spring6.service.CustomerService;
import com.goal.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {

    @Test
    public void injectTest() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();

    }

    @Test
    public void testConstructorDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor.xml");

        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        customerService.save();

    }

}
