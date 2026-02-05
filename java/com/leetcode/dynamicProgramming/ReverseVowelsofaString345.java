package com.leetcode.dynamicProgramming;
import java.util.Stack;
public class ReverseVowelsofaString345 {
    public static String reverseVowels(String s) {
            String vowels = "aeiouAEIOU";
            char[] charArray = new char[s.length()];
            for(int i = 0; i< s.length(); i++){
                charArray[i] = s.charAt(i);
            }
            int left = 0;
            int right = s.length() - 1;
            while(left < right){
                while(left < right && vowels.indexOf(charArray[left]) == -1){
                    left++;
                }
                while(left < right && vowels.indexOf(charArray[right]) == -1){
                    right--;
                }
                if(left < right){
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                }
            }
            String res = "";
            for(char c : charArray){
                res += c;
            }
            return res;
        }
}
