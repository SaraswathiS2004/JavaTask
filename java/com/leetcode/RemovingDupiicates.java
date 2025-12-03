package com.leetcode;

import java.util.Arrays;

public class RemovingDupiicates {
    public int removeDuplicates(int[] nums) {
        int index = 1;
           int target = nums[0];
            for (int j = 1; j < nums.length; j++) {
                 if (target < nums[j]) {
                    nums[index] = nums[j];
                    target = nums[j];
                    index++;
                }
            }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}
