package com.jamison.leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> resList = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                resList.add(true);
            }else {
                resList.add(false);
            }
        }
        return resList;
    }
}
