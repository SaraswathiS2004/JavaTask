package com.leetcode.dynamicProgramming;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        //binary Search algorithm
        int left = 0;
        int right = nums.length -1;
        int mid = 0;
        while(left <= right){
            mid = (left + right)/2;
            int n = nums[mid];
            if(n == target){
                return mid;
            }
            else if(target > n){
                left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] nums = {2 , 5};
        int target = 5;
        System.out.println(search(nums , target));
    }
}
