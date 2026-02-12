package com.superEasyProblem;

public class AddDigits258 {
    public int addDigits(int num) {
        int x = num;
        int sum = 0;
        while(true){
            sum += x % 10;
            x /=10;
            if(x == 0){
                if(sum < 10) return sum;
                x = sum;
                sum = 0;
            }
        }
    }
}
