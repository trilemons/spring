package com.lml.spring.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

    @Pointcut("execution(* com.lml.spring.service..*(..))")
    public void pointcut(){

    }

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable{
        try {
            System.out.println("开始事务！");
            joinPoint.proceed();
            System.out.println("提交事务！");
        }catch (Exception e){
            System.out.println("回滚事务！");
        }
    }

}
