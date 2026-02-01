package com.leetcode.Array;

import java.util.Arrays;

public class FirstMissingPositive41 {
    public int firstMissingPositive(int[] nums) {
        int target = 1;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            if(target == nums[i]){
                target++;
            }
            else if(target < nums[i]){
                break;
            }
        }
        return target;
    }

    public static class ConcatenationofArrayQ1 {

    }
}
