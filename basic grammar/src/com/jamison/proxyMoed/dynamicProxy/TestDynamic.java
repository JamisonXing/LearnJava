package com.jamison.proxyMoed.dynamicProxy;

import com.jamison.proxyMoed.staticProxy.impl.SmsServiceImpl;

/**
 * @author jamison
 */
public class TestDynamic {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("jamison");
    }
}
