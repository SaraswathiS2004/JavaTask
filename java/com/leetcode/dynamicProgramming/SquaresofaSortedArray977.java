package com.leetcode.dynamicProgramming;

public class SquaresofaSortedArray977 {
    public int[] sortedSquares(int[] nums) {

        int index = 0;
        int[] array = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            int squares = nums[i] * nums[i];
            array[index ++] = squares;
        }
        accendingOrder(array);
        return array;
    }
    public void accendingOrder(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j>0; j--){
                int n = arr[j];
                int n1 = arr[j -1];
                if(n < n1){
                    arr[j] = n1;
                    arr[j -1] = n;
                }
            }
        }
    }
}
