package com.leetcode.Array;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {

        // HashMap <Integer , Integer> map = new HashMap<>();
        // for(int i = 0; i< nums.length; i++){
        //     map.put(nums[i] , map.getOrDefault(nums[i] , 0)+ 1);
        // }
        // for(int i = nums.length - 1; i >=0; i--){
        //     int n = nums[i];
        //     if(map.get(n) > nums.length/2){
        //         return n;
        //     }
        // }
        // return 0;
        // Boyer Moore Algorithm for Pattern Searching
        int vote = 0;
        int candidate = nums[0];
        for(int i = 1; i< nums.length; i++){
            int n = nums[i];
            if(n == candidate){
                vote++;
            }
            else if(vote == 0){
                candidate = n;
            }
            else {
                vote --;
            }
        }
        return candidate;
    }
}
