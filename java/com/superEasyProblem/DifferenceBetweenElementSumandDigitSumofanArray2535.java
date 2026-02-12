package com.superEasyProblem;

public class DifferenceBetweenElementSumandDigitSumofanArray2535 {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;

        for(int i = 0; i< nums.length; i++){
            int n = nums[i];
            sum += n;
            digitSum += splitInteger(n);
        }
        int difference = sum - digitSum;
        return Math.abs(difference);
    }
    public int splitInteger(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
