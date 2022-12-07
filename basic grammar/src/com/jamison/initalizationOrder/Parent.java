package com.jamison.initalizationOrder;

/**
 * @author jamison
 */
public class Parent {
    //静态代码块
    static {
        System.out.println("父类静态代码块");
    }

    //实例语句块
    {
        System.out.println("父类实例语句块");
    }

    /**
     * 构造函数
     */
    public Parent() {
        System.out.println("父类构造函数");
    }
}
