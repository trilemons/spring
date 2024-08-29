package com.lml.spring;

import com.lml.spring.bean.Rich;
import com.lml.spring.bean.Student;
import com.lml.spring.bean.User;
import com.lml.spring.bean.Vip;
import org.junit.Test;
import org.spring.bean.Gay;
import org.spring.bean.Gun;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

public class AnnoTest {
    @Test
    public void annoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Student userBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        Rich hhh = applicationContext.getBean("hhh", Rich.class);
        System.out.println(hhh);

    }
    @Test
    public void gunTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = applicationContext.getBean("gun", Gun.class);
        System.out.println(gun);

    }

    @Test
    public void gayTest(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        Gay gay = applicationContext.getBean("gay", Gay.class);
        gay.printMan();

    }
}
