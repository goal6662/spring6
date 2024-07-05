package com.goal;

import com.goal.spring6.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        User user = context.getBean("user", User.class);

        // 使用bean
        System.out.println("4. 使用bean, " + user);

        // 关闭容器，销毁Bean
        context.close();
    }
}