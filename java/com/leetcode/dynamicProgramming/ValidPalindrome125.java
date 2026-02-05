package com.leetcode.dynamicProgramming;

public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        String res = "";
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)){
                res += Character.toLowerCase(c);
            }
        }
        return checkIsPalindrome(res);
    }
    public boolean checkIsPalindrome(String s){
        int left =0;
        int right = s.length()-1;
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
