package com.jamison.collection_test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * 将集合中的重复元素去掉
 * @author jamison
 */
public class Test3 {
    public static void main(String[] args) {
        /**
         * 分析：
         * 1. 创建一个List集合存储若干重复元素
         * 2. 单独定义方法去除重复
         * 3. 打印List集合
         */
        ArrayList<String> ss = new ArrayList<>();
        ss.add("a");
        ss.add("a");
        ss.add("a");
        ss.add("b");
        ss.add("b");
        ss.add("b");
        ss.add("b");
        ss.add("c");
        ss.add("c");
        ss.add("c");
        ss.add("d");
        ss.add("d");
        ss.add("d");

        getSingle(ss);

        System.out.println(ss);
    }

    private static void getSingle(List<String> list) {
        LinkedHashSet<String> lss = new LinkedHashSet<>();
        lss.addAll(list);
        list.clear();
        list.addAll(lss);
    }
}
