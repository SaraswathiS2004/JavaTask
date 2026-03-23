package com.leetcode.Array.TopInterview;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean [] result = new boolean[candies.length];
        int max = Integer.MIN_VALUE;
        for(int j = 0; j< candies.length; j++){
            max = Math.max(candies[j] , max);
        }
        for(int i = 0; i< candies.length; i++){
            int sum = extraCandies + candies[i];
            if(max <= sum){
                result[i] = true;
            }
        }

        List<Boolean> list = new ArrayList<>();
        for(boolean x : result){
            list.add(x);
        }
        return list;
    }
}
