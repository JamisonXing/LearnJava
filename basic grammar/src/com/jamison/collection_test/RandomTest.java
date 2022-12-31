package com.jamison.collection_test;

import java.util.HashSet;
import java.util.Random;

/**
 * 产生10个1~20之间的随机数，要求随机数不能重复
 * @author jamison
 */
public class RandomTest {
    /**
     * 分析：
     * 1. 用Random类创建对象
     * 2. 十个不重复随机数，使用HashSet
     * 3. 如果HashSet Size < 10 就可以继续存储，如果 >= 就停止存储
     * 4. 通过Random类中的nextInt方法获取1到20之间的随机数，并将其存储到HashSet中
     * 5. 遍历HashSet
     */
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> hs = new HashSet<>();

        while(hs.size() < 10) {
            hs.add(random.nextInt(20) + 1);
        }

        for(Integer i : hs) {
            System.out.println(i);
        }
    }
}
