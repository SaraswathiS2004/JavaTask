package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /**
     *@link https://leetcode.com/problems/two-sum/description
  */
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){

            int n = target - nums[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{3 ,2,4} , 7)));
    }
}
