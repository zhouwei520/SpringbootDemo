package com.zw.demo10.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ServiceAspect { //定义一个业务层的拦截处理

    private Logger log= LoggerFactory.getLogger(ServiceAspect.class);

    @Around("execution(* com.zw..service..*(..))")
    public Object aspectServiceInvoke(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        this.log.info("[*******Service-Before*********]执行参数"+
                Arrays.toString(proceedingJoinPoint.getArgs()));
        Object object= proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());//进行具体业务调用
        this.log.info("[****Service-After****]返回结果"+object);
        return  object;
    }



}
