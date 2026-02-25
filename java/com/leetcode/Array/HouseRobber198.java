package com.leetcode.Array;

public class HouseRobber198 {
    public int rob(int[] nums) {

        int best = 0;
        int secondBest = 0;
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            int skip = best;
            int rob = nums[i] + secondBest;
            max = Math.max(skip , rob);
            secondBest = best;
            best = max;
        }
        return best;
    }
}
