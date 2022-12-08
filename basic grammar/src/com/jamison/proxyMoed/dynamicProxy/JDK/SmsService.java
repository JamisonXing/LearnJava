package com.jamison.proxyMoed.dynamicProxy.JDK;

/**
 * @author jamison
 */
public interface SmsService {
    /**
     * 发送信息
     * @param message
     * @return
     */
    String send(String message);
}
