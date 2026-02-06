package com.leetcode.dynamicProgramming;

import java.util.Arrays;

public class TransformedArray3379 {
    public static int[] constructTransformedArray(int[] nums) {
            int[] arr = new int[nums.length];
            for(int i = 0; i <  nums.length; i++){
                int n = nums[i];
                int sum = (n + i) % nums.length;
                if(sum < 0){
                    sum = sum + nums.length;
                }
                arr[i] = nums[sum];
        }
        return arr;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(constructTransformedArray(new int[]{-10 , -10 ,-4})));
    }
}
