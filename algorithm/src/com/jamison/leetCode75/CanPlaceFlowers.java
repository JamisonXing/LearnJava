package com.jamison.leetCode75;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while(i < flowerbed.length && n > 0) {
            if(flowerbed[i] == 1) {
                i += 2;
            } else if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else {
                i +=3;
            }
        }
        return n <= 0;
    }
}
