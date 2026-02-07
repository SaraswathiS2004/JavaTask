package com.leetcode.dynamicProgramming;

public class RotatedDigits {
    public static int rotatedDigits(int n) {
        int count = 0;

        for(int i = 1; i <= n; i++){
            int val = i;
            boolean isTrue = false;
            while(val != 0){
                int remainder = val % 10;

                if(remainder == 3 || remainder == 4 || remainder == 7){
                    isTrue = false;
                    break;
                }
                else if(remainder != 1 && remainder != 0 && remainder != 8){
                    isTrue = true;
                }
                val /= 10;
            }
            if(isTrue) count++;
        }
        return count;
    }
    public static void main(String [] args){
        int n = 857;
        System.out.println(rotatedDigits(n));
    }
}
