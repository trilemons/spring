package com.lml.spring6;


import com.lml.spring6.bean.*;
import com.lml.spring6.service.ConstructService;
import com.lml.spring6.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {

    @Test
    public void diTest(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean.xml");
        UserService userServiceBean = beanFactory.getBean("userServiceBean", UserService.class);

        userServiceBean.createUsermsg();
        userServiceBean.setName();
    }
    @Test
    public void constructiTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        ConstructService constructServiceBean = applicationContext.getBean("constructServiceBean", ConstructService.class);
        constructServiceBean.showMsg();
    }

    @Test
    public void setDiTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setBeans.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);

        System.out.println(Integer.TYPE);
    }

    @Test
    public void setArraysTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-arrays.xml");
        YuQian yuQianBean = applicationContext.getBean("yuQianBean", YuQian.class);
        System.out.println(yuQianBean);

    }

    @Test
    public void bubbleSortTest(){
        int[] a = new int[10];

        for (int i = 0;i<a.length;i++){
            a[i] = (int)(Math.random()*10);
        }

        int temp;

        for (int i = 0;i<a.length;i++)
            for (int j = 0; j <a.length-i-1 ; j++) {
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        for (int t: a) {
            System.out.print(t+" ");
        }
    }

    @Test
    public void jiLianTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jilian.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);

    }

    @Test
    public void collectionTest(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Spring-collection.xml");
        Person personBean = classPathXmlApplicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }

    @Test
    public void springCTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean);

    }

    @Test
    public void outerPropertiesTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-propertie.xml");
        MyDataSource myDataSourceBean = applicationContext.getBean("myDataSourceBean", MyDataSource.class);
        System.out.println(myDataSourceBean);

    }
}
