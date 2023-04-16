package com.jamison.jianzhi_offer2;

public class Exchange {
    public int[] exchange(int[] nums) {
        int i = 0, curr = 0;
        int len = nums.length;
        for (int j = 0; j < len; j++) {
            if(nums[j] % 2 != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
            }
        }
        return nums;
    }
}
