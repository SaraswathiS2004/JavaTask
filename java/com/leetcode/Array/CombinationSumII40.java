package com.leetcode.Array;

import java.util.*;

public class CombinationSumII40 {

    public static List<List<Integer>> findCombination(int[] arr , int target , int index , List<List<Integer>> result , ArrayList<Integer> temp){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return result;
        }
        for (int i = index; i< arr.length; i++) {
            int n = arr[i];
            if(i > index && arr[i] == arr[i -1]){
                continue;
            }
            else if(n > target){
                break;
            }
            temp.add(n);
            findCombination(arr, target - n, i+1, result, temp);
            temp.removeLast();
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        List<List<Integer>> result = findCombination(arr , 8, 0 , new ArrayList<>() , new ArrayList<>());
        System.out.println(result);
    }
}
