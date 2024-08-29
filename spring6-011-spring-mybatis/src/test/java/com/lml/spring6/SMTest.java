package com.lml.spring6;

import com.lml.spring6.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SMTest {
    @Test
    public void smTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);

        try {
            accountService.transferMoney("act-001","act-002", 10000.0);
            System.out.println("转账成功！");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
