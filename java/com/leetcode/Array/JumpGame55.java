package com.leetcode.Array;

import java.util.Arrays;

public class JumpGame55 {

    public static boolean canJump(int[] nums) {

        int goal = nums.length -1;
        for(int i= nums.length -2; i >= 0; i--){
            int sum = nums[i] + i;
            if(sum >= goal){
                goal = i;
            }
        }
        if(goal == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int [] nums = {2,3,1,0,4};
        System.out.println(canJump(nums));
    }
}
