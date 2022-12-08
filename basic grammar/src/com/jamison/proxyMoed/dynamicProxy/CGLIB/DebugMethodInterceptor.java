package com.jamison.proxyMoed.dynamicProxy.CGLIB;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自定义MethodInterceptor（方法拦截器）
 * @author jamison
 */
public class DebugMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //调用方法之前添加自己的操作
        System.out.println("before method" + method.getName());
        Object object = methodProxy.invokeSuper(o, args);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method" + method.getName());
        return object;

    }
}
