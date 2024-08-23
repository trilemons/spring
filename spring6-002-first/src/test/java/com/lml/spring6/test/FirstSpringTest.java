package com.lml.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {
    @Test
    public void testFirstSpringCode(){
        //第一步获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //根据bean的id获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
    }
}
