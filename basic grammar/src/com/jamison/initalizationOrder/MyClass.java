package com.jamison.initalizationOrder;

/**
 * 普通类的执行顺序为：静态代码块 → 实例语句块 → 构造函数。
 * @author jamison
 */
public class MyClass {
    //静态代码块
    static {
        System.out.println("静态代码块");
    }

    //实例语句块
    {
        System.out.println("实例语句块");
    }

    /**
     * 构造函数
     */
    public MyClass() {
        System.out.println("构造函数");
    }
}
