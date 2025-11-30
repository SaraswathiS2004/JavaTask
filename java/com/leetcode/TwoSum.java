package com.leetcode;
//https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i< nums.length -1; i++){
            int n = nums[i] + nums[i+1];
            if(n == target){
                return new int[]{i , i+ 1};
            }
        }
        return new int[]{};
    }
}
