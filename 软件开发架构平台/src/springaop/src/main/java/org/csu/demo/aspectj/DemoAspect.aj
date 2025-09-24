package org.csu.demo.aspectj;

public aspect DemoAspect {

    pointcut demoPointCut() : execution(void DemoClass.demo());

    before() : demoPointCut(){
        System.out.println("before advice....vjjkh.");
    }
}
