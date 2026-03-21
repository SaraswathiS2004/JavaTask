package com.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII137 {
    public int singleNumber(int[] nums) {

        // 1.Bit Manipulation

        //2.HashMap

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+ 1);
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
