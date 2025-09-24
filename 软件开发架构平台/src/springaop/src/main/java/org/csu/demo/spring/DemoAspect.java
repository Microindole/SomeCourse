package org.csu.demo.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Pointcut("execution(* org.csu.demo.spring.ProductDao.insert(..))")
    public void pointCut1(){

    }

    @Before("pointCut1()")
    public void demoAdvice(){
        System.out.println("前置建议1……");
    }
}
