package com.leetcode;

public class LongestPalindrome {
    public static boolean reverseTheString(String str){
        int ind = 0;
        for(int j = str.length()-1; j>= str.length()/2; j--){
            char c1 = str.charAt(j);
            char c2 = str.charAt(ind);
            if(c1 != c2){
                return false;
            }
            ind++;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len = 0;
        String res = "";
        for(int i = 0; i< s.length(); i++){
            int j = s.length();
            while(j > i){
                String s1 = s.substring(i , j);
                if(reverseTheString(s1)){
                    if(len < s1.length()) {
                        len = s1.length();
                        res = s1;
                    }
                }
                j--;
            }
        }
        return res;
    }
}
