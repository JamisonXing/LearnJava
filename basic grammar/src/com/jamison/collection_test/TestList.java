package com.jamison.collection_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jamison
 */
public class TestList {
    public static void main(String[] args) {
        //创建集合对象
        //ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        //添加
        list.add(123);
        list.add(124);
        list.add(126);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(124);
        list1.add(126);
        //将其他集合整体添加到指定集合中
        list.addAll(list1);
        System.out.println(list1);

        //修改
        list.set(0, 234);

        //获得元素
        Integer num = list.get(1);
        System.out.println(num);

        //删除
        //根据下标进行移除
        list.remove(2);
        //根据内容删除，只有Integer数据类型比较尴尬，不能直接写数字，分不清到底是index还是value，要new出来
        list.remove(new Integer(234));
        System.out.println(list);

        //清空集合内容
        //list.removeAll(list);
        list.clear();

        boolean empty = list.isEmpty();
        System.out.println(empty);

        //集合长度
        int size = list.size();
        System.out.println(size);

        //判断
        //根据内容返回数组下标，如果元素内容不存在返回-1
        int i = list.indexOf(126);
        System.out.println(i);
        //判断集合是否包含指定元素，返回true or false
        boolean IsContains = list.contains(126);
        System.out.println(IsContains);
    }
}
