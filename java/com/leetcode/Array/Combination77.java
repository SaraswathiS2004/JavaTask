package com.leetcode.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        findCombination(n , k , 1 , new ArrayList<>() , result);
        System.out.println(result);
        return result;
    }
    public static List<List<Integer>> findCombination(int n , int k , int index , ArrayList<Integer> temp , List<List<Integer>> result) {
        if(temp.size() == k){
            result.add(new ArrayList<>(temp));
            return result;
        }
        else if(index > n){
            return result;
        }
        for(int i = index; i<= n; i++){
            temp.add(i);
            findCombination(n , k , i+1 , temp , result);
            temp.removeLast();
        }
        return result;
    }
    public static void main(String[] args){
        int n = 2;
        int k = 1;
        System.out.println(combine(n , k));
    }
}
