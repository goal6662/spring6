package com.goal.spring6.service;

import com.goal.spring6.dao.UserDao;
import com.goal.spring6.dao.VipDao;

public class UserService {

    private UserDao userDao;

    private VipDao vipDao;

    public UserService() {
    }

    public UserService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser() {
        System.out.println("正在保存用户信息");

        vipDao.insertVip();
        userDao.insert();
    }

}
