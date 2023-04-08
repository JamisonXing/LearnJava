package com.jamison.jianzhi_offer2;
//剑指 Offer 11. 旋转数组的最小数字

//二分法
public class MinArray {
    public int minArray(int[] numbers) {
        int left  = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int m = left + (right - left) / 2;
            if(numbers[m] > numbers[right]) {
                left = m + 1;
            } else if(numbers[m] < numbers[right]) {
                right = m;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
