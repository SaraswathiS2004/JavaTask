package com.leetcode.Array;

public class LongestCommonPrefix14 {
        public String longestCommonPrefix(String[] strs) {
            String result = "";
            int index = 0;
            for(int i = 0; i< strs[0].length(); i++){
                String s = strs[0];
                if(s.length() > index) {
                    char c = s.charAt(index);
                    int ind = 1;
                    while (strs.length > ind) {
                        String s1 = strs[ind];
                        if(s1.length() <= index){
                            return result;
                        }
                        char c1 = s1.charAt(index);
                        if (c1 != c) {
                            return result;
                        }
                        ind++;
                    }
                    result += c;
                    index++;
                }
            }
            return result;
        }
}
