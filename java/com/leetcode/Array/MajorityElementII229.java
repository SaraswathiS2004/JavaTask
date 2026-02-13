package com.leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII229 {

        public List<Integer> majorityElement(int[] nums) {
            int n = nums.length /3;
            ArrayList<Integer> arr = new ArrayList<>();
            HashMap<Integer , Integer> map = new HashMap<>();

            for(int x : nums){
                map.put(x , map.getOrDefault(x , 0)+ 1);
            }
            for(Map.Entry<Integer , Integer> entry : map.entrySet()){
                if((Integer) entry.getValue() > n){
                    arr.add(entry.getKey());
                }
            }
            return arr;
        }
}
