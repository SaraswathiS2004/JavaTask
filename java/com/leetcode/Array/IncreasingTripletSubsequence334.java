package com.leetcode.Array;

import java.util.Arrays;

public class IncreasingTripletSubsequence334 {

    public static boolean increasingTriplet(int[] nums) {
            if(nums.length < 3){
                return false;
            }
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for(int i = 0; i< nums.length; i++){
                int n= nums[i];
                if(n <= first){
                    first = n;
                }
                else if(n <= second){
                    second = n;
                }
                else {
                    return true;
                }
            }
            return false;
    }
    public static void main(String[] args){

        int [] matrix = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(matrix));
    }
}
