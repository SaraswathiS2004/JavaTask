package com.leetcode.Array;

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++) {
            int a = nums[i];
            if (a > target || a == target) {
                return i;
            }
        }
        return nums.length;
    }
}
