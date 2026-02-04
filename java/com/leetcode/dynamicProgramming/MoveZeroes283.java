package com.leetcode.dynamicProgramming;

public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 1; i< nums.length; i++){
            int n1 = nums[i];
            int n2 = nums[i - 1];
            if(n1 != 0 && n2 == 0){
                nums[index] = n1;
                nums[i] = n2;
                index++;
            }
            else if(n1 == 0 && n2 != 0){
                nums[index] = n2;
                nums[i] = n1;
                index++;
            }
            else if(n1 != 0 &&  n2 != 0){
                index++;
            }
        }
    }
}
