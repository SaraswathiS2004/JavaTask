package com.leetcode.Array;

public class CountingBits338 {
    public int[] countBits(int n) {
        int [] dp = new int[n + 1];
        int sum = 1;
        for(int i = 1; i<= n; i++){
            if(sum * 2 == i){
                sum = i;
            }
            dp[i] = dp[i - sum] + 1;
        }
        return dp;
    }
}
