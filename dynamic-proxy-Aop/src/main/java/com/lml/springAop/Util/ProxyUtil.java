package com.lml.springAop.Util;

import com.lml.springAop.bean.MyInvocationHandler;
import com.lml.springAop.bean.OrderService;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object createProxy(Object object){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new MyInvocationHandler(object));
    }
}
