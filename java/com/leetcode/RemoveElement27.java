package com.leetcode;

import java.util.Arrays;

public class RemoveElement27 {
    public int removeElement ( int[] nums, int val){
        int k = 0;
        for (int j = 0; j < nums.length; j++) {
            int n = nums[j];
            if (n != val) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
}