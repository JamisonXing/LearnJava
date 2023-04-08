package com.jamison.jianzhi_offer2;
//剑指 Offer 11. 旋转数组的最小数字

//暴力求解
public class MinArray {
    public int minArray(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] - numbers[i + 1] > 0) {
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }
}
