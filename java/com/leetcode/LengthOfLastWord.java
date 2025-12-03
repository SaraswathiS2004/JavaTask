package com.leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String [] array = s.split("\\s");
        return array[array.length - 1].length();
    }
}
