package com.jamison.proxyMoed.staticProxy.impl;

import com.jamison.proxyMoed.staticProxy.SmsService;

/**
 * 创建代理类并同时实现发送短信的接口
 * @author jamison
 */
public class SmsProxy implements SmsService {
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method send()");
        smsService.send(message);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method send()");
        return null;
    };
}
