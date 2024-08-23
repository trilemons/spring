package com.lml.spring6.service;

import com.lml.spring6.dao.UserDao;
import com.lml.spring6.dao.VipDao;

public class ConstructService {
    private UserDao userDao;
    private VipDao vipDao;

    public ConstructService(UserDao userDao,VipDao vipDao){
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void showMsg(){
        userDao.createUser();
        vipDao.setNMeg();
    }


}
