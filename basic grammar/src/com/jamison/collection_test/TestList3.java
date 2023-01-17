package com.jamison.collection_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamison
 */
public class TestList3 {
    public static void main(String[] args) {
        //集合中也可以保存集合
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> subList01 = new ArrayList<>();
        subList01.add(12);
        subList01.add(13);
        subList01.add(14);
        List<Integer> subList02 = new ArrayList<>();
        subList02.add(12);
        subList02.add(13);
        subList02.add(14);

        list.add(subList01);
        list.add(subList02);
        System.out.println(list);
    }
}
