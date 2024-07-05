package com.goal.spring6.date;

import java.util.Date;

public class Student {
    private Date birthday;

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthday=" + birthday +
                '}';
    }
}
