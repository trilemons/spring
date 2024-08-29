package com.lml.springAop.bean;

public class OrderServiceImp implements OrderService{
    @Override
    public String getOrderName(String a) {
        return a;
    }

    @Override
    public void createOrder() {
        System.out.println("生成订单！");

    }

    @Override
    public void destroyOrder() {
        System.out.println("销毁订单！");

    }
}
