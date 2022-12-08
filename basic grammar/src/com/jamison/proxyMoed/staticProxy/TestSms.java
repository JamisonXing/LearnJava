package com.jamison.proxyMoed.staticProxy;

import com.jamison.proxyMoed.staticProxy.SmsService;
import com.jamison.proxyMoed.staticProxy.impl.SmsProxy;
import com.jamison.proxyMoed.staticProxy.impl.SmsServiceImpl;

/**
 * 实际使用
 * @author jamison
 */
public class TestSms {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("jamison");
    }
}
