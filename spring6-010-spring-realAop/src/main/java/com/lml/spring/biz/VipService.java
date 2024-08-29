package com.lml.spring.biz;

import org.springframework.stereotype.Service;

@Service
public class VipService {
    public void createVip(){
        System.out.println("创建会员信息");
    }

    public void deleteVip(){
        System.out.println("删除会员信息");
    }

    public void modifyVip(){
        System.out.println("修改会员信息");
    }

    public void getVip() {
        System.out.println("获取会员信息");
    }
}
