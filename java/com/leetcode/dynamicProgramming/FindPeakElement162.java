package com.leetcode.dynamicProgramming;

public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        int peak = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i< nums.length - 1; i++){
            int left = nums[i];
            int mid = nums[i+1];
            if(nums.length == i + 2){
                if(left < mid){
                    peak = mid;
                    index = i + 1;
                }
            }
            else {
                int right = nums[i+2];
                if (left < mid && right < mid) {
                    if (peak < mid) {
                        peak = mid;
                        index = i + 1;
                    }
                }
            }
        }
        return index;
    }
}
