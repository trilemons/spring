package com.lml.spring.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    public void login() throws Exception {
        System.out.println("登陆成功！");
//        if (1==1){
//             throw new Exception("无法登录");
//        }
    }

}
