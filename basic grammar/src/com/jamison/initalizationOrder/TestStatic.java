package com.jamison.initalizationOrder;

/**
 *这里需要注意的是，（静态）非静态成员域在定义时初始化和（静态）非静态块中初始化的优先级是平级的，也就是说按照从上到下初始化，最后一次初始化为最终的值（不包括非静态的成员域在构造器中初始化）。所以在（静态）非静态块中初始化的域甚至能在该域声明的上方，因为分配存储空间在初始化之前就完成了。
 * @author jamison
 */
public class TestStatic {
    static {
        a = 1;
    }
    static  int a = 3;
    static {
        b = 5;
    }
    static  int b = 7;

    public static void main(String[] args) {
        System.out.println("初始化变量后的a,b值");
        System.out.println(a);
        System.out.println(b);
    }
    /**
     * 初始化变量后的a,b值
     * 3
     * 7
     */
}
