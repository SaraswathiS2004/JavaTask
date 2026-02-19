package com.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CheckifEveryRowandColumnContainsAllNumbers2133 {
    public boolean checkValid(int[][] matrix) {
        boolean  horizontal = checkHorizontal(matrix);
        boolean vertical = checkVertical(matrix);
        return horizontal && vertical;
    }
    public static boolean checkHorizontal(int [][] nums ){

        int y = 0;
        for(int j = 0; j< nums.length; j++) {
            ArrayList<Integer> map = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.contains(nums[j][i])) return false;
                map.add(nums[j][i]);
            }
        }
        return true;
    }
    public static boolean checkVertical(int [][] nums ){
        for(int k = 0; k < nums.length; k++) {
            ArrayList<Integer> map = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.contains(nums[i][k])) return false;
                map.add(nums[i][k]);
            }
        }
        return true;
    }
}
