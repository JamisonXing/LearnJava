package com.jamison.leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, candies[i]);
        }
        ArrayList<Boolean> resList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resList.add(candies[i] + extraCandies >= max);
        }
        return resList;
    }
}
