package com.leetcode.Array;

public class NumberComplement476 {
    public static int findComplement(int num) {
        String s = convertBinary(num);
        String value = "";
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            value += (c == '0') ? '1' : '0';
        }
        int result = Integer.parseInt(value , 2);
        return result;
    }
    public static String convertBinary(int n){
        StringBuilder str = new StringBuilder();
        while(n != 0){
            int m = n % 2;
            n = n/2;
            str.insert(0 , String.valueOf(m));
        }
        return str.toString();
    }
    public static void main(String[] args){
        System.out.println(findComplement(4));
    }
}
