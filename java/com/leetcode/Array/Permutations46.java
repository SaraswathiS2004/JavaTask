package com.leetcode.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    public static List <List<Integer>> insertValue (Integer [] arr ,  int n){
        List<List<Integer>> toReturn = new ArrayList<>();
        int len = arr.length + 1;
        for(int i = 0; i< len; i++){
            int j = 0;
            ArrayList<Integer> insert = new ArrayList<>();
            while(j < arr.length){
                int addValue = n;
                if(i != j || insert.size() - 1== i ){
                    addValue = arr[j];
                    j ++;
                }
                insert.add(addValue);
            }
            if(i== j){
                insert.add(n);
            }
            toReturn.add(insert);
        }
        return toReturn;
    }
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length ==  1){
            ArrayList<List<Integer>> MainArr = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(nums[0]);
            MainArr.add(arr);
            return MainArr;
        }
        int [] copyArray = Arrays.copyOfRange(nums , 0 , nums.length - 1);
        int n = nums[nums.length - 1];
        List <List<Integer>> list = permute(copyArray);
        List<List<Integer>> mainArr = new ArrayList<>();
        for(List<Integer> x : list){
            List<Integer> intArr = (List) x;
            Integer [] arr = intArr.toArray(new Integer[0]);
            List<List<Integer>> li = insertValue(arr , n);
            mainArr.addAll(li);
        }

        return mainArr;
    }
}