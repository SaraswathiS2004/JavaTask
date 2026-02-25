package com.leetcode.Array;

import java.util.Arrays;

public class ScoreAfterFlippingMatrix861 {
    public static int matrixScore(int[][] grid) {

        int rowsLen = grid.length;
        int colsLen = grid[0].length;
        for(int row = 0; row< rowsLen; row++){
            int n = grid[row][0];
            if(n == 0){
                for(int column = 0; column < colsLen; column ++){
                    grid[row][column] ^= 1;
                }
            }
        }

        for(int column = 1; column < colsLen; column ++){
            int countNumber0 = 0;
            for(int row = 0; row < rowsLen; row++){
                int n = grid[row][column];
                if(n == 0){
                    countNumber0++;
                }
            }
            if(countNumber0 > (rowsLen - countNumber0)){
                for(int row = 0; row < rowsLen; row++){
                    grid[row][column] ^= 1;
                }
            }
        }

        int totalSum = 0;
        for(int row = 0; row < rowsLen; row++){
            int sum = 0;
            for(int col = 0; col < colsLen; col ++){
                sum = (sum << 1) + grid[row][col]; //left shift
            }
            totalSum += sum;
        }
        return totalSum;
    }
    public static void main(String [] args){

        int [][] matrix = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        matrixScore(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
