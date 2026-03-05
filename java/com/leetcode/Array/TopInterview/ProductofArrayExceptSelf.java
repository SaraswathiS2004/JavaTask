package com.leetcode.Array.TopInterview;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
    //    int [] prefix = new int[nums.length];
   //     int [] suffix = new int[nums.length];
    //     int start = nums[0];
    //     //find prefix
    //     prefix[0] = 1;
    //     suffix[nums.length -1] = 1;
    //     for(int i = 1; i< nums.length; i++){
    //         prefix[i] = nums[i -1] * prefix[i -1];
    //     }
    //     //find suffix
    //     for(int k = nums.length - 1; k>0; k--){
    //         suffix[k -1] = nums[k] * suffix[k];
    //     }
    //     for(int m = 0; m< prefix.length; m++){
    //         suffix[m] = suffix[m] * prefix[m];
    //     }
    //     return suffix;

   // Another method

    int [] result = new int[nums.length];

    result [0] = 1;
    //left
    for(int i = 1; i< nums.length; i++){
        result[i] = nums[i - 1] * result[i  -1];
    }
    System.out.println(Arrays.toString(result));
    //right

    int right = 1;

    for(int j = nums.length - 1; j>=0; j--){
        result[j] = result[j]* right;
        right = nums[j] * right;
    }

    return result;
    }
    public static void main(String[] args){
     int [] nums = {1, 2, 3, 4};
     System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
