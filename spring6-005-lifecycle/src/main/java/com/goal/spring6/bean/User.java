package com.goal.spring6.bean;

import lombok.ToString;

@ToString
public class User {

    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("1. 创建对象【有参】");
    }

    public User() {
        System.out.println("1. 创建对象");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. 属性赋值");
    }

    public void initBean() {
        System.out.println("3. 初始化Bean");
    }

    public void destroyBean() {
        System.out.println("5. 销毁Bean");
    }
}
