package com.leetcode.Array;

import java.util.HashMap;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String [] numarals  = {"M" , "CM" , "D" , "CD" , "C" , "XC" ,  "L","XL" , "X" ,"IX" , "V" ,"IV" , "I"};
        int [] values = {1000 , 900 , 500 , 400 , 100 , 90 ,  50 ,40 ,10 ,  9 , 5 , 4 , 1};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(num != 0){
            if(num >= values[i]){
                num -= values[i];
                sb.append(numarals[i]);
            }
            else {
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(intToRoman(58));
    }
}
