package com.sherlock;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/8/19 11:04
 */
@Aspect
@Component
public class NotVeryUsefulAspect {

    @Pointcut("execution(* com.sherlock.service..*.*(..))")
    public void anyOldTransfer() {}

    @Before("anyOldTransfer()")
    public void advice() {
        System.out.println("前置通知。。。");
    }
}
