package com.leetcode.StringProblems;

public class AddBinary67{
public String addBinary(String a, String b) {
    int sum = 0;
    int i = a.length() -1;
    int j = b.length() - 1;
    int carry = 0;
    StringBuilder str = new StringBuilder();
    while(i >= 0 || j >= 0 || carry == 1){
        sum = carry;
        if(i >= 0){
            sum += a.charAt(i) - '0';
            i--;
        }
        if(j >= 0){
            sum += b.charAt(j) -'0';
            j--;
        }
        str.append(sum % 2);
        carry = sum/2;
    }
    String result = str.reverse().toString();
    return result;
}
}
