package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMysql;
import com.powernode.spring6.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Override
    public void deleteUser() {
        userDao.deleteById();
        //处理业务信息
    }
}
