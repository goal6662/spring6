package com.goal.spring6.bean;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Student {

    private String[] hobbies;
    private User[] teachers;
}
