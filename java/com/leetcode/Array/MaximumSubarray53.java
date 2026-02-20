package com.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumSubarray53 {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        //kadane's algorithm

        // for(int i = 0; i< nums.length; i++){
        //     sum += nums[i];
        //     if(nums[i] > sum){
        //         sum = nums[i];
        //     }
        //     max = Math.max(max , sum);

        // }

        // other solution
        for(int i = 0; i< nums.length; i++){
            sum = Math.max (nums[i] , sum + nums[i]);
            max = Math.max(max , sum);
        }
        return max;
    }
    public static void main(String[] args){
        int [] nums ={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));//output = 6
    }
}
