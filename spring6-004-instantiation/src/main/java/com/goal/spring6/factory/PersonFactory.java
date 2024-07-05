package com.goal.spring6.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * 约定大于配置，实现了该接口
 *  Spring就知道要调用哪个方法
 */
public class PersonFactory implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        System.out.println("PersonFactory.getObject");
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
