package com.leetcode.Array;

public class BestTimetoBuyandSellStockII122 {
    public int maxProfit(int[] prices) {

        int sum = 0;
        for(int i = 1; i< prices.length; i++){
            int n = prices[i];
            int m = prices[i - 1];
            if(m < n){
                int differ = n - m;
                sum += differ;
            }
        }
        return sum;
    }
}
