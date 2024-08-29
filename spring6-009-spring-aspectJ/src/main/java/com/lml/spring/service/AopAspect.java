package com.lml.spring.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("aopAspect")
@Aspect//切面类需要Aspect注解
@Order(2)
public class AopAspect {

    @Pointcut("execution(* com.lml.spring.service.*.*(..))")
    public void pointCut(){
        //切点表达式的复用
    }

    //切面 = 切点 + 通知
    //通知就是增强
    //通知以方法的形式出现，因为方法中可以写代码
    //出现在目标方法前
    @Before("pointCut()")
    public void beforeEnhance(){
        System.out.println("这是一段前置增强代码。");
    }
    //出现在目标方法后
    @AfterReturning("pointCut()")
    public void afterEnhance(){
        System.out.println("这是一段后置增强代码。");
    }
    //环绕出现在最前最后
    @Around("pointCut()")
    public void aroundEnhance(ProceedingJoinPoint joinPoint) throws Throwable {
        //前环绕
        System.out.println("前环绕");
        joinPoint.proceed();//执行目标
        //后环绕
        System.out.println("后环绕");
    }

    //出现在发生异常时候的通知
    @AfterThrowing("pointCut()")
    public void exceptionAdvice(){
        System.out.println("异常通知。");
    }

    //finally语句块中的通知
    @After("pointCut()")
    public void finalEnhance(){
        System.out.println("最后增强。");

    }

}