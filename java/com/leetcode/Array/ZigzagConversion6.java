package com.leetcode.Array;

import java.util.Arrays;

public class ZigzagConversion6 {
    public String convert(String s, int numRows) {
        StringBuilder[] strings = new StringBuilder[numRows];
        if(numRows == 1) return s;
        for(int i = 0; i< strings.length; i++){
            strings[i] = new StringBuilder();
        }
        int index = 0;
        int j = 0;
        boolean isTrue = false;

        while(j < s.length() && index < s.length()) {
            char c = s.charAt(j);
            strings[index] = strings[index].append(c);
            if(index == 0 || index == numRows - 1) {
                isTrue = !isTrue;
            }
            if(isTrue) {
                index ++;
            }
            else if( !isTrue) {
                index--;
            }
            j++;
        }
        return convertString(strings);
    }
    public String convertString(StringBuilder[] strings){
        String res = "";
        for(StringBuilder s1 : strings){
            res += s1;
        }
        return res;
    }
}
