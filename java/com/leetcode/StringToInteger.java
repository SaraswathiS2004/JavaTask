package com.leetcode;

public class StringToInteger {

    public static int myAtoi(String s){
        String str = "";
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(str.isEmpty() && c == 32){
                continue;
            }
            else if((c >= 48 && c <= 57) || ((c == 45 || c == 43 ) && str.isEmpty()) || (c == 46 && !str.isEmpty())){
                str += c;
            }
            else{
                break;
            }
        }
        int res = 0;
        long l = 0;
        try {
            l = str.isEmpty() ? 0 : Long.parseLong(str);
            if (Integer.MIN_VALUE >= l) {
                res = Integer.MIN_VALUE;
            } else if (Integer.MAX_VALUE <= l) {
                res = Integer.MAX_VALUE;
            } else {
                res = (int) l;
            }
        }
        catch (Exception e1){
            try {
                res = (int) Double.parseDouble(str);
            }
            catch (Exception e2){
                return res;
            }
        }
        return res;
    }
    public static void main(String [] args){
        String str = " 042";
        System.out.println(myAtoi(str));
    }
}
