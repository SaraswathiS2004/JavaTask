package com.leetcode.Array;

public class Searcha2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {

        //Binary search per row
        // for(int row = 0; row < matrix.length; row++){
        //     int start = 0;
        //     int end = matrix[0].length -1;
        //     while(start <= end){
        //         int mid = (start + end)/2;
        //         if(matrix[row][mid] == target){
        //             return true;
        //         }
        //         else if(matrix[row][mid] > target){
        //             end = mid -1;
        //         }
        //         else {
        //             start = mid + 1;
        //         }
        //     }
        // }
        // return false;

        //Faster Staircase Search

        int col = matrix[0].length -1;
        int row = 0;
        while(col >= 0 && row < matrix.length){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }
    public static void main(String[] args){
        int [][] nums = {{1, 3, 5},
//                {10, 11, 16, 20},
//                {23, 30, 34, 60}
        };
        System.out.println(searchMatrix(nums , 1) +"11");
    }
}
