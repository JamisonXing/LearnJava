package com.jamison.jianzhi_offer.day8;

//https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
public class NumWays {
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
