package com.leetcode.Array;

public class ConcatenationofArrayQ1 {
    public int[] getConcatenation(int[] nums) {
        int[] array = new int[2 * nums.length];
        int index = 0;
        for(int i = 0; i< 2; i++){
            for(int j = 0; j< nums.length; j++){
                array [index++] = nums[j];
            }
        }
        return array;
    }
}
