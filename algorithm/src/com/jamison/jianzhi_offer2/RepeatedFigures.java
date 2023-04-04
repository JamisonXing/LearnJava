package com.jamison.jianzhi_offer2;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatedFigures {
    public int findRepeatNum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : nums) {
            if(!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
}
