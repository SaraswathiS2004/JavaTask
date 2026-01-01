package com.leetcode;

public class SearchRotatedArray {

    public static int findSearch(int [] arr , int target){
        for(int j = 0; j< arr.length; j++) {
            int n = arr[j];
            if(target == n){
                return j;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr = {1};
        int result = findSearch(arr , 2);
        System.out.println(result);
    }
}
