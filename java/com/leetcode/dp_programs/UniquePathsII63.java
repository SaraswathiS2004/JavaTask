package com.leetcode.dp_programs;

public class UniquePathsII63 {

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        int n = uniquePathsWithObstacles(obstacleGrid , 0 , 0, dp);
        return n;
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid , int x , int y , int [][] dp) {
        if(x >= obstacleGrid.length || y >= obstacleGrid[x].length) return 0;
        else if(x == obstacleGrid.length -1 && y == obstacleGrid[x].length -1 && obstacleGrid[x][y] == 0) return 1;
        else if(obstacleGrid[x][y] == 1) return 0;
        if(dp[x][y] != 0) return dp[x][y];
        int right = uniquePathsWithObstacles(obstacleGrid , x , y + 1 , dp);
        int down =  uniquePathsWithObstacles(obstacleGrid , x + 1 , y ,dp);
        dp[x][y] = right + down;
        return dp[x][y];
    }
    public static void main(String[] args){
        int [][] obstacleGrid = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int [][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
