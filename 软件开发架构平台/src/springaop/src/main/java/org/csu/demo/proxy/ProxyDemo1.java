package org.csu.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo1 implements InvocationHandler {

    private Object proxyObject;

    public ProxyDemo1(Object proxyObject) {
        this.proxyObject = proxyObject;
    }

    public static Object bind(Object Object) {
        Class class1 = Object.getClass();
        return Proxy.newProxyInstance(class1.getClassLoader(), class1.getInterfaces(), new ProxyDemo1(Object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeLogging();
        Object object = method.invoke(proxyObject, args);
        afterLogging();
        return object;
    }

    public void beforeLogging(){
        System.out.println("beforeLogging");
    }

    public void afterLogging(){
        System.out.println("afterLogging");
    }
}
