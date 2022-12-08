package com.jamison.proxyMoed.dynamicProxy.CGLIB;

/**
 * 实现一个使用阿里云发送信息的类
 * @author jamison
 */
public class AliSmsService {
    public String send(String message) {
        System.out.println("send message" + message);
        return message;
    }
}
