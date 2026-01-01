package com.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
        char c = s.charAt(i);
        if(stack.size() != 0 && (stack.peek() + 1 == c || stack.peek() + 2 == c)){
            stack.pop();
        }
        else{
            stack.add(c);
        }
    }
        return stack.size() == 0 ? true : false;
}
public static void main(String[] args){
    String s = "[({}[])]";
    System.out.println(isValid(s));
}
}
