package com.leetcode.Array;

public class SumClosest3_16 {
    public int threeSumClosest(int[] nums, int target) {
        sort(nums);
        int currentsumthree = nums[0] + nums[1] + nums[2];
        for(int i = 0; i< nums.length; i++){
            int left = i + 1;
            int right = nums.length -1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int differ1 = Math.abs(sum - target);
                int differ2 = Math.abs(currentsumthree - target);
                if(differ1 < differ2) currentsumthree = sum;
                else if(sum < target) left ++;
                else right --;
            }
        }
        return currentsumthree;
    }
    public static void sort(int [] nums){

        for(int i = 0; i< nums.length; i++){
            for(int j = i; j>0; j--){
                int temp = nums[j];
                if(nums[j] < nums[j -1]){
                    nums[j] = nums[j-1];
                    nums[j -1] = temp;
                }
            }
        }
    }
}
