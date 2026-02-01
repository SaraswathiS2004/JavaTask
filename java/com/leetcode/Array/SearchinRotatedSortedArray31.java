package com.leetcode.Array;

public class SearchinRotatedSortedArray31 {
    public int search(int[] nums, int target) {
        for(int j = 0; j< nums.length; j++) {
            int n = nums[j];
            if(target == n){
                return j;
            }
        }
        return -1;
    }
}
