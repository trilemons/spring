package com.lml.spring.biz;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(){
        System.out.println("创建用户信息");
    }

    public void deleteUser(){
        System.out.println("删除用户信息");
    }

    public void modifyUser(){
        System.out.println("修改用户信息");
    }

    public void getUser() {
        System.out.println("获取用户信息");

    }
}