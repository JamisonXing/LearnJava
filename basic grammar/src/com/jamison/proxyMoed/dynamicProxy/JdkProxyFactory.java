package com.jamison.proxyMoed.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * @author jamison
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                //目标类的类加载
                target.getClass().getClassLoader(),
                //代理需要实现的接口，可指定多个
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target)
        );
    }
}
