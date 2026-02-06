package com.leetcode.dynamicProgramming;

public class ReverseInteger7 {
    public int reverse(int x) {
        //     long result = 0;
        //     while(x != 0){
        //         result = (result * 10) + x % 10;
        //         x = x /10;
        //     }

        //     if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
        //         return 0;
        //     }
        // return  (int) result;

        boolean isNegative = x < 0;
        int result = 0;
        x = Math.abs(x);
        while(x > 0){
            if(result > Integer.MAX_VALUE/10){
                return 0;
            }
            result = (result * 10) + (x % 10);
            x = x /10;
        }
        if(isNegative){
            result = -result;
        }
        return result;
    }
}
