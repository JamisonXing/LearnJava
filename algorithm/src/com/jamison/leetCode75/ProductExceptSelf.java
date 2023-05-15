package com.jamison.leetCode75;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        //LR分别代表左右两侧乘积列表
        int[] L = new int[len];
        int[] R = new int[len];
        L[0] = 1;
        R[len - 1] = 1;

        int[] ans = new int[len];
        //填充
        for(int i = 1; i < len; i++) {
            L[i] = L[i - 1] * nums[i - 1];
        }

        for (int i = len - 2; i >= 0; i--) {
            R[i] = R[i + 1] * nums[i + 1];
        }

        //填充答案
        for (int i = 0; i < len; i++) {
            ans[i] = L[i] * R[i];
        }

        return ans;
    }
}
