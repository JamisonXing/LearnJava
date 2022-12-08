package com.jamison.proxyMoed.staticProxy.impl;

import com.jamison.proxyMoed.staticProxy.SmsService;

/**
 * 实现发送短信的接口
 * @author jamison
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message" + message);
        return message;
    }
}
