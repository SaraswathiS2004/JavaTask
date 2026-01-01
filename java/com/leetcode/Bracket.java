package com.leetcode;

public class Bracket {
    public static boolean recursiveCheck(String str){
        if(str.length() == 1){
            return false;
        }
        for(int i = 1; i< str.length() - 1; i++) {
           int c1 = str.charAt(i);
           recursiveCheck(Character.toString(str.charAt(i + 1)));
            int c2 = str.charAt(i);
            if( c1 + 1 == c2 || c1 + 2 == c2){
                return true;
            }
            else{
                recursiveCheck(str);
            }

        }

        return true;
    }
    public static void main(String [] args){

        System.out.println(recursiveCheck("(])"));
    }
}
