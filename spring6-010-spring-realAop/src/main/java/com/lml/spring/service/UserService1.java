package com.lml.spring.service;

import org.springframework.stereotype.Service;

@Service("userService1")
public class UserService1 {

    public void createUser(){
        System.out.println("创建用户信息");
    }

    public void deleteUser(){
        System.out.println("删除用户信息");
    }

    public void modifyUser(){
        System.out.println("修改用户信息");
    }

    public void getUser() throws Exception {
        System.out.println("获取用户信息");
        throw new Exception("hhhh");
    }
}
