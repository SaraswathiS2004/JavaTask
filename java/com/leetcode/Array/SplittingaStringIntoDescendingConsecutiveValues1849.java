package com.leetcode.Array;

public class SplittingaStringIntoDescendingConsecutiveValues1849 {

    public static boolean splitString(String s) {
        for(int i=0; i< s.length() -1; i++){
            long s1 = Long.parseLong(s.substring(0 , i + 1));
            if (s1 > Long.MAX_VALUE / 10) {
                break;
            }

            if(backTrack(s ,s1 , i + 1 , 1)){
                return true;
            }
        }
        return false;
    }
    public static boolean backTrack(String s , long prev , int index ,int count){

        if(index == s.length()){
            return count >= 2;
        }
        long num  = 0;
        for(int i = index; i< s.length(); i ++){
            long first = s.charAt(i) - '0';
            if(first > Long.MAX_VALUE/10){
                break;
            }
            num = num * 10 + first;
            if(num == prev - 1){
                if(backTrack(s,num, i +1 , count+1)){
                    return true;
                }
            }
            if(prev <= num){
                break;
            }
        }
        return false;
    }
    public static void main(String [] args){
        String s = "9080701";
        boolean isTrue = splitString(s);
        System.out.println(isTrue);
    }
}
