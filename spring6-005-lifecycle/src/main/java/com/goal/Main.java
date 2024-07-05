package com.goal;

import com.goal.spring6.bean.Student;
import com.goal.spring6.bean.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        User user = context.getBean("user", User.class);

        // 使用bean
        System.out.println("4. 使用bean, " + user);

        // 注册个人Bean
        registerBean(context);

        // 关闭容器，销毁Bean
        context.close();
    }

    public static void registerBean(BeanFactory beanFactory) {
        Student student = new Student();
        System.out.println(student);

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory(beanFactory);
        factory.registerSingleton("student", student);

        Student bean = factory.getBean("student", Student.class);
        System.out.println(bean);
    }
}