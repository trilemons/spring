package com.lml.spring;

import com.lml.spring.biz.SpringConfig;
import com.lml.spring.biz.UserService;
import com.lml.spring.biz.VipService;
import com.lml.spring.service.Spring6Config;
import com.lml.spring.service.UserService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    @Test
    public void aopTest() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService1 userService = applicationContext.getBean("userService1", UserService1.class);

        userService.createUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();

    }
    @Test
    public void securityAopTest() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        UserService1 userService1 = applicationContext.getBean("userService1", UserService1.class);

        userService1.createUser();
        userService1.deleteUser();
        userService1.modifyUser();
        userService1.getUser();

        userService.createUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();

        vipService.createVip();
        vipService.deleteVip();
        vipService.modifyVip();
        vipService.getVip();


    }
}
