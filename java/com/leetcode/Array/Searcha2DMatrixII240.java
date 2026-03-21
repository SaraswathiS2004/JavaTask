package com.leetcode.Array;

public class Searcha2DMatrixII240 {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column >= 0){
            int left = 0 , right = matrix[0].length -1;
            while(left <= right){
                int mid = (left + right)/2;
                if(matrix[row][mid] == target) return true;
                else if(target < matrix[row][mid]) right = mid -1;
                else if(target > matrix[row][mid]) left = mid +1;
            }
            if(right >= 0 && target < matrix[row][right]){
                column = right;
            }
            else column = left;
            row ++;
        }
        return false;
    }
    public static void main(String[] args){
        int [][] nums = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;

        System.out.println(searchMatrix(nums , target));

    }
}
