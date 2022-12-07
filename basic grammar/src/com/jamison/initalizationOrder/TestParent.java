package com.jamison.initalizationOrder;

/**
 * 继承类的执行顺序为：父类静态代码块 → 子类静态代码块 → 父类实例语句块 → 父类构造函数 → 子类实例语句块 → 子类构造函数。
 * @author jamison
 */
public class TestParent {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

/**
 * result:
 * 父类静态代码块
 * 子类静态代码块
 * 父类实例语句块
 * 父类构造函数
 * 子类实例语句块
 * 子类构造函数
 */