package com.leetcode.Array;
import java.util.Arrays;
public class ClimbingStairs70 {
    public int climbStairs(int n) {
        int [] dp = new int[n +1];
        // return tabulation(n);
        Arrays.fill(dp , -1);
        return memoization(n , dp);
    }
    public int memoization(int n , int [] dp){

        if(n <= 2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        else {
            dp[n] = memoization((n - 1) , dp) + memoization((n - 2) , dp);
        }
        return dp[n];
    }
    public int tabulation(int n){

        if(n <= 2){
            return n;
        }
        int dp [] = new int[n  + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<= n; i++)
            dp[i] = dp[i -1]  + dp[i -2];
        return dp[n];
    }
}
