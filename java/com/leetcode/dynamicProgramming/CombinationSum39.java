package com.leetcode.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findTarget(candidates , target , 0 , new ArrayList<>() , result);
        return result;
    }
    public void findTarget(int [] candidates  , int target , int index , ArrayList<Integer> arr  , List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(arr));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = index; i< candidates.length; i++){
            int n = candidates[i];
            arr.add(n);
            findTarget(candidates , target - n , i , arr, result);
            arr.removeLast();
        }
    }
}
