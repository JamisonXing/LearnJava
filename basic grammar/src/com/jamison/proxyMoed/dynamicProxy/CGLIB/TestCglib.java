package com.jamison.proxyMoed.dynamicProxy.CGLIB;

/**
 * @author jamison
 */
public class TestCglib {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("jamison");
    }
}
