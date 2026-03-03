package com.leetcode.Array;

public class HouseRobberIV2560 {
    public int minCapability(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            max = Math.max(max ,nums[i]);
        }
        int left = 1;
        int right = max;
        int capability = max;
        while(left <= right){
            int mid = left + (right - left)/2;
            int count = 0;
            int i = 0;
            while(i < nums.length){
                int m = nums[i];
                if(m <= mid){
                    count++;
                    i +=2;
                }
                else i ++;
            }
            if(count >= k){
                capability = mid;
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return capability;
    }
}
