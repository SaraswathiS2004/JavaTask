package com.leetcode;

public class Palindrome {

    public static boolean checkPalindrome(String s){
        int l = s.length() -1;
        for(int k = 0; k< s.length()/2; k++){
            char c = s.charAt(k);
            char c1 = s.charAt(l);
            if(c != c1){
                return false;
            }
            l--;
        }
        return true;
    }
    public static String isPalindrome(String str) {

        if(str.length() == 1){
            return str;
        }
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length() - i; j++) {
                int index = str.length() - j;
                int count = j;
                 s = "";
                while (index > i+1 && count < str.length()) {
                    s += str.charAt(count);
                    count++;
                    index--;
                }
                System.out.println(s);
                if(checkPalindrome(s)){
                    return s;
                }
            }
        }
        return s;
    }
    public static void main(String[] args){
        String s = "babad";
        System.out.println(isPalindrome(s));
    }
}
