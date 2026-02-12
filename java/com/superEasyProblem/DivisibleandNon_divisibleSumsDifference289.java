package com.superEasyProblem;

public class DivisibleandNon_divisibleSumsDifference289 {
    public int differenceOfSums(int n, int m) {
        int divisible = 0;
        int notDivisible = 0;
        for(int i = 1; i<= n; i++){
            if(i % m != 0){
                divisible += i;
            }
            else{
                notDivisible += i;
            }
        }
        int difference = divisible - notDivisible;
        return difference;
    }
}
