package com.jamison.initalizationOrder;

/**
 * @author jamison
 */
public class Child extends Parent{
    //静态代码块
    static {
        System.out.println("子类静态代码块");
    }

    //实例语句块
    {
        System.out.println("子类实例语句块");
    }

    /**
     * 构造函数
     */
    public Child() {
        System.out.println("子类构造函数");
    }
}
