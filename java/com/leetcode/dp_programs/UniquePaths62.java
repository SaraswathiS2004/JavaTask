package com.leetcode.dp_programs;

import java.util.Arrays;

public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        int num = findUniquePaths(m ,n , 0 , 0 , dp);
        return num;
    }
    public static int findUniquePaths(int m, int n , int x ,int y , int [][] dp){
        if(x >= m || y >= n)return 0;
        else if( x == m -1 && y == n -1) return 1;
        else if(dp[x][y] != 0) return dp[x][y];

        int right = findUniquePaths(m , n , x , y+1 , dp);
        int down = findUniquePaths(m , n , x+1 , y , dp);
        dp[x][y] = right + down;
        return dp[x][y];
    }
}
