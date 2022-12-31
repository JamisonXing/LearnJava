package com.jamison.collection_test;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 使用Scanner从键盘读取一行输入，去掉其中重复字符，打印出不同的那些字符
 * @author jamison
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * 分析：
         * 1. 创建Scanner对象
         * 2. 创建HashSet对象存储字符，去重
         * 3. 将字符串转化为字符数组，存储到HashSet中自动去除重复
         * 4. 遍历
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a string");

        HashSet<Character> cs = new HashSet<>();

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        for (Character c : arr) {
            cs.add(c);
        }

        for (Character c : cs) {
            System.out.println(c);
        }
    }
}
