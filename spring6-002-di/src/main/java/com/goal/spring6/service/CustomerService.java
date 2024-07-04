package com.goal.spring6.service;

import com.goal.spring6.dao.UserDao;
import com.goal.spring6.dao.VipDao;

/**
 * 基于构造方法注入
 */
public class CustomerService {

    private UserDao userDao;

    private VipDao vipDao;


    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save() {

        userDao.insert();
        vipDao.insertVip();

    }

}
