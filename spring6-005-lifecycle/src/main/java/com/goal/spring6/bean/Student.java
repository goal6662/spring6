package com.goal.spring6.bean;

import org.springframework.beans.factory.DisposableBean;

public class Student implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Student.destroy");
    }
}
