package com.lml.spring6;

import com.lml.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
    @Test
    public void lifeTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println("第四步：使用bean。"+userBean);
        ClassPathXmlApplicationContext applicationContext1 = (ClassPathXmlApplicationContext) applicationContext;
        applicationContext1.close();

    }
}
