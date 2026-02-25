package com.leetcode.Array;

public class HouseRobberII213 {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int firstMax = findMaxRob(nums , 0 , nums.length -1);
        int secondMax = findMaxRob(nums , 1, nums.length);
        int max = Math.max(firstMax , secondMax);
        return max;
    }
    public int findMaxRob(int nums[] , int start , int end){
        int best = 0;
        int secondBest = 0;
        int max = 0;
        for(int i = start; i<end; i++){
            int skip = best;
            int rob = nums[i] + secondBest;
            max = Math.max(skip , rob);
            secondBest = best;
            best = max;
        }
        return best;
    }
}
