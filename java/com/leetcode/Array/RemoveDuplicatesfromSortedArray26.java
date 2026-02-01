package com.leetcode.Array;

public class RemoveDuplicatesfromSortedArray26 {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int index = 1;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[j - 1]) {
                    nums[index++] = nums[j];
                }
            }
            return index;
        }
}
