package com.jamison.proxyMoed.dynamicProxy;

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
