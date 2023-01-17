package com.jamison.collection_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamison
 */
public class TestList2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("----遍历方法1----");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----遍历方法2----");
        for(Integer num : list) {
            System.out.println(num);
        }
    }
}
