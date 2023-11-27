package com.liangyi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut(value = "@annotation(com.liangyi.annotation.TestAnnotation)")
    public void pointcut(){

    }

    @Around(value = "pointcut()")
    public void doAround(ProceedingJoinPoint jp){
        try{
            jp.proceed();
        }catch (Throwable e){
            System.out.println(e.toString());
        }
    }
    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void doAfterThrowing(Throwable e){
        System.out.println("doAfterThrowing");
    }

}
