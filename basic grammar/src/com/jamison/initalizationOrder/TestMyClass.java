package com.jamison.initalizationOrder;

/**
 * @author jamison
 */
public class TestMyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
    }
}
/**
 * result:
 * 静态代码块
 * 实例语句块
 * 构造函数
 */