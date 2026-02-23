package com.leetcode.Array;

public class SearchinRotatedSortedArrayII81 {
    public boolean search(int[] nums, int target) {

        if(nums.length == 1){
            return nums[0] == target;
        }
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = (start + end)/ 2;
            if(nums[mid] == target) return true;
            if(nums[mid] == nums[start] &&  nums[mid] == nums[end]){
                start = start + 1;
                end = end -1;
                continue;
            }
            else if(nums[start] <= nums[mid]){ //left sorted
                if(target >= nums[start] && target <= nums[mid]) end = mid -1;
                else start = mid +1;
            }
            else { // right sorted
                if(target >= nums[mid] && target <= nums[end]) start = mid +1;
                else end = mid - 1;
            }
        }
        return false;
    }
}
