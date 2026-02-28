package com.leetcode.Array;

public class Numberof1Bits191 {
    public static int hammingWeight(int n) {
        if(n == 0) return n;
        int count = 0;
        while(n > 1){
            if(n % 2 == 1) count++;
            n = n/2;
        }
        count ++;
        return count;
    }
    public static void main(String[] args){
        System.out.println(hammingWeight(11));
    }
}
