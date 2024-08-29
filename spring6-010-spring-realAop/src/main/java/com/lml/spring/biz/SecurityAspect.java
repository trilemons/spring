package com.lml.spring.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class SecurityAspect {

    @Pointcut("execution(* com.lml.spring.biz..*(..))")
    public void allPointCut(){

    }



    @Before("allPointCut()")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(new Date());

        System.out.println(format + " zhangsan " + joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

    }
}
