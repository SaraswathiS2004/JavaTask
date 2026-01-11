package com.leetcode;

public class NumberPalindrome {
    public static boolean isPalindrome(int x) {
        int res = 0;
        if(x < 0){
            return false;
        }
        int n = x;
        while(x != 0){
            res = (res * 10) + x % 10;
            x = x/10;
        }
        return n == res;
    }
    public static void main(String [] args){
        int n = 121;
        System.out.println(isPalindrome(n));
    }
}
