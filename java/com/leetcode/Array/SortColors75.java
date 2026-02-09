package com.leetcode.Array;

public class SortColors75 {
    public void sortColors(int[] nums) {

        // dutch algorithm

        int low = 0;
        int high = nums.length - 1;
        int current = 0;
        while(current<=high){
            int n = nums[current];
            if(n == 0){
                swap(low , current, nums);
                low++;
                current++;
            }
            else if(n == 1){
                current++;
            }
            else if(n == 2){
                swap(current , high , nums);
                high--;
            }
        }
    }
    public void swap(int i , int j , int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
