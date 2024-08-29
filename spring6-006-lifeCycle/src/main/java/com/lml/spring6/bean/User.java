package com.lml.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class User implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware , InitializingBean ,DisposableBean{

    private String name;

    User(){
        System.out.println("第一步：无参构造方法执行。");
    }

    public void setName(String name) {
        System.out.println("第二步：给bean赋值。");
        this.name = name;
    }

    public void initBean(){
        System.out.println("第三步：初始化bean。");
    }

    public void destroyBean(){
        System.out.println("第五步：销毁bean。");
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("①Bean的name是："+s);

    }
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("②Bean这个类的加载器是："+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("③生产这个Bean的工厂对象是："+beanFactory);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitialzingBean's afterPropertiesSet method 执行。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean's destroy method 执行。");
    }
}
