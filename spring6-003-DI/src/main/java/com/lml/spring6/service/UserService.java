package com.lml.spring6.service;

import com.lml.spring6.dao.UserDao;
import com.lml.spring6.dao.VipDao;

public class UserService {
    private UserDao userDao;
    private VipDao vipDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void setXyz(VipDao vipDao){
        this.vipDao = vipDao;
    }

    public void createUsermsg(){
        userDao.createUser();
    }

    public void setName(){
        vipDao.setNMeg();
    }
}
