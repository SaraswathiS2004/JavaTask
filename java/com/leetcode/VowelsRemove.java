package com.leetcode;

import java.util.Locale;

public class VowelsRemove {
    public static String removeVowels(String str){

        char [] vowels = {'A' , 'E' ,'I' , 'O' , 'U' , 'a' , 'e' , 'i' , 'o' , 'u'};

        String res = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            boolean isVowels = false;
            for(char x : vowels){
                if(x == c){
                    isVowels = true;
                    break;
                }
            }
            int count = 1;
            if(isVowels) {

                String lowercase = str.toLowerCase();
                 char s1 = Character.toLowerCase(c);
                for (int k = 0; k< str.length(); k++){
                    if(i != k) {
                        char s2 = lowercase.charAt(k);
                        if(s1 == s2){
                            count ++;
                        }
                    }
                }
            }
            if(count >= 2){
                res += c;
            }
            else if(!isVowels){
                res += c;
            }

        }
        return res;
    }
    public static void main(String [] args){
        String s = "Cat";
        String s1 = "Compuuter";
        System.out.println("input : "+ s +" output : "+removeVowels(s));
        System.out.println("input : "+ s1 +" output : "+removeVowels(s1));
    }
}
