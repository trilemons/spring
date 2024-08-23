package com.lml.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    public void createUser(){
        logger.info("数据库正在创建用户信息...");
    }
}
