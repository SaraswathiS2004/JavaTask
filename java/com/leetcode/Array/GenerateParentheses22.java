package com.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> result = findParenthesses(n , 0 , 0, "" , new ArrayList<>());
        return result;
    }
    public static ArrayList<String> findParenthesses(int n , int openCount , int closeCount , String s , ArrayList<String> str){
        if(n == openCount && n == closeCount){
            str.add(s);
            return str;
        }
        if(n > openCount)  findParenthesses(n, openCount + 1, closeCount, s + "(", str);
        if(openCount > closeCount)  findParenthesses(n , openCount , closeCount + 1 , s + ")" , str);
        return str;
    }
    public static void main(String[] args){
        int n = 2;
        System.out.println(findParenthesses(n , 0 , 0 , "" , new ArrayList<>()));
    }
}
