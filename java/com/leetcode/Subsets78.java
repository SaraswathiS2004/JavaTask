package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        return findSubsets(nums , 0 , new ArrayList<>() , new ArrayList<>() );
    }
    public List<List<Integer>> findSubsets(int [] nums , int index , List<List<Integer>> subSets , ArrayList<Integer> subArr){
        if(index == nums.length){
            subSets.add(new ArrayList<>(subArr));
            return subSets;
        }
        subArr.add(nums[index]);
        findSubsets(nums , index + 1, subSets , subArr);
        subArr.removeLast();
        return findSubsets(nums , index + 1, subSets , subArr);
    }
}
