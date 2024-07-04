package com.goal.spring6.bean;

import lombok.Data;

@Data
public class MyDataSource {

    private String driverClass;
    private String url;
    private String username;
    private String password;

}
