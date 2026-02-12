package com.superEasyProblem;

public class CounttheDigitsThatDivideaNumber2520 {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while(temp !=0){
            int val = temp % 10;
            int n = num % val;
            if(n == 0){
                count++;
            }
            temp/= 10;
        }
        return count;
    }
}
