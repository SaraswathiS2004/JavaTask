package com.leetcode.Array;

import java.util.Stack;

public class LongestValidParentheses32 {
    public static int longestValidParentheses(String s) {

        int open = 0;
        int close = 0;
        int max = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') open ++;
            else close++;
            if(open == close) max = Math.max(max , close * 2);
            else if(open < close) open = close = 0;
        }
        open = 0;
        close = 0;

        for(int j = s.length()- 1; j>= 0; j--){
            char c = s.charAt(j);
            if(c == '(') open ++;
            else close++;
            if(open == close) max = Math.max(max , open * 2);
            else if(open > close) open = close = 0;
        }
        return max;
    }
    public static void main(String[] args){
        String s = "(()";
        int n = longestValidParentheses(s);
        System.out.println(n);
    }
}
