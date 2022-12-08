package com.jamison.proxyMoed.dynamicProxy.JDK;

import com.jamison.proxyMoed.dynamicProxy.JDK.JdkProxyFactory;
import com.jamison.proxyMoed.dynamicProxy.JDK.SmsService;
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
