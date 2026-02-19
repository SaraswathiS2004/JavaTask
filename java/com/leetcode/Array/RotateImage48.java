package com.leetcode.Array;

import java.util.Arrays;

public class RotateImage48 {
    public static void rotate(int[][] matrix) {

        //row to column
        for(int i = 0; i< matrix.length; i++){
            for(int j = i; j< matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse each row of matrix


        for(int i = 0; i< matrix.length; i++){
            int left = 0;
            int right = matrix.length -1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
public static void main(String[] args){
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    rotate(matrix);
    System.out.println(Arrays.deepToString(matrix));
}
}
