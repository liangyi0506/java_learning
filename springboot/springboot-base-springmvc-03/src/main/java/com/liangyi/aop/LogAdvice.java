package com.liangyi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {

    @Before("execution(* com.liangyi.controller.*.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("LogAdvice before");
        System.out.println("joinPoint = " + joinPoint);
    }
}
