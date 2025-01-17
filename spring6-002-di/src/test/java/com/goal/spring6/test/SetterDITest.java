package com.goal.spring6.test;

import com.goal.spring6.bean.MyDataSource;
import com.goal.spring6.bean.Student;
import com.goal.spring6.bean.User;
import com.goal.spring6.dao.OrderDao;
import com.goal.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SetterDITest {

    @Test
    public void outerDITest() {
        System.out.println(new Date());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("set-di.xml");

        OrderService orderService = context.getBean("orderServiceInner", OrderService.class);
        orderService.generate();

        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void arrayTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);

    }


    @Test
    public void propertiesTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource source = context.getBean("myDataSource", MyDataSource.class);

        System.out.println(source);
    }

}
