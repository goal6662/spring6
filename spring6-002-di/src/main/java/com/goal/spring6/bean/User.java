package com.goal.spring6.bean;

import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@ToString
public class User {

    private String name;    // 简单类型

    private int age;    // 基本数据类型
    private Double salary;  // 包装类

    private Date birthday;  // 日期
}
