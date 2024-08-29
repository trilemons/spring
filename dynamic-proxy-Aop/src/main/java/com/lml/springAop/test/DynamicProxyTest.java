package com.lml.springAop.test;

import com.lml.springAop.Util.ProxyUtil;
import com.lml.springAop.bean.MyInvocationHandler;
import com.lml.springAop.bean.OrderService;
import com.lml.springAop.bean.OrderServiceImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImp();

        OrderService proxy = (OrderService) ProxyUtil.createProxy(orderService);

        System.out.println(proxy.getOrderName("李四"));
        proxy.createOrder();
        proxy.destroyOrder();

    }
}
