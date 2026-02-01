package com.leetcode.Array;

public class FindFirstandLastPositionofElementinSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int [] newArr = {- 1 , -1};
        boolean isFirst = true;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                if(isFirst) {
                    newArr[0] = i;
                    newArr[1] = i;
                    isFirst = false;
                }
                newArr[1] = i;
            }
        }
        return newArr;
    }
}
