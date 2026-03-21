package com.leetcode.Array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII80 {
    public static int removeDuplicates(int[] nums) {

        if(nums.length <= 2) return nums.length;

        int index = 2;
        for(int i = 2; i< nums.length; i++){

            if(nums[i] != nums[index -2]){
                nums[index] = nums[i];
                index++;
            }

        }

        System.out.println(Arrays.toString(nums));
        return index;
    }
    public static void main(String[] args){
        int [] nums = {1 , 1, 1 , 2 ,3 , 3};
        System.out.println(removeDuplicates(nums));
    }
}
