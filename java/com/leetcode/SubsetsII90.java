package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        findSubsets(nums , 0 , result , new ArrayList<>());
        return result;
    }
    public void findSubsets(int [] nums , int index , List<List<Integer>> subSets , ArrayList<Integer> subArr){
        if(index == nums.length){
            if(!subSets.contains(subArr)){
                subSets.add(new ArrayList<>(subArr));
            }
            return;
        }
        subArr.add(nums[index]);
        findSubsets(nums , index + 1, subSets , subArr);
        subArr.removeLast();
        findSubsets(nums , index + 1, subSets , subArr);
    }
}
