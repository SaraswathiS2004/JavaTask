package com.leetcode;

import java.util.Arrays;

public class MissingPositive {
    public static int findMissingPossitive(int [] arr){
        int target = 1;
        Arrays.sort(arr);
        for(int i = 0; i< arr.length; i++){
            int n = arr[i];
            if(target == n){
                target++;
            }
        }
        return target;
    }
    public static void main(String [] args){
        int [] arr = {7,8,9,11,12};
        int result = findMissingPossitive(arr);
        System.out.println(result);
    }
}
