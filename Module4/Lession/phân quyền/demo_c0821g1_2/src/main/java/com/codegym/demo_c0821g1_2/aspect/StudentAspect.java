package com.codegym.demo_c0821g1_2.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Around("execution(* com.codegym.demo_c0821g1_2.controller.StudentController.*(..))")
//    public void logAfterMethod(JoinPoint joinPoint) {
//        String nameMethod = joinPoint.getSignature().getName();
////        System.out.println("Tên phương thức là: "+ nameMethod);
//        logger.info("Tên phương thức là: "+ nameMethod);
//    }

}
