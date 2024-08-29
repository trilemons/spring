package com.lml.spring.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class SecurityAspect {

    @Before("com.lml.spring.service.AopAspect.pointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().toString());
        System.out.println("安全前置通知");
    }

    @After("com.lml.spring.service.AopAspect.pointCut()")
    public void afterAdvice(){
        System.out.println("安全后置通知");
    }

    @Around("com.lml.spring.service.AopAspect.pointCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("安全前环绕通知");
        joinPoint.proceed();
        System.out.println("安全后环绕通知");
    }
}
