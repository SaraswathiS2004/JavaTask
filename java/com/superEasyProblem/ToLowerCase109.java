package com.superEasyProblem;

public class ToLowerCase109 {
    public String toLowerCase(String s) {
        String res = "";
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c >=65 && c <=90) {
                int x = c + 32;
                c = (char) x;
            }
            res += c;
        }
        return res;
    }
}
