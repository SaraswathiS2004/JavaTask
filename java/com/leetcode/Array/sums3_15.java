package com.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sums3_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            while (i > 0 && i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (i < nums.length && left < right) {
                int fixed = nums[i];
                int start = nums[left];
                int end = nums[right];
                int sum = fixed + start + end;
                if (sum == 0) {
                    result.add(Arrays.asList(fixed, start, end));
                    left++;
                    right--;
                    while (left < nums.length && nums[left - 1] == nums[left]) {
                        left++;
                    }
                    while (right >= 0 && nums[right + 1] == nums[right]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}

