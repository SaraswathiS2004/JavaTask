package com.superEasyProblem;

public class FindifDigitGameCanBeWon3232 {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0;
        int twoDigit = 0;
        for(int i = 0; i< nums.length; i++){
            int n= nums[i];
            if(n >= 10){
                twoDigit += n;
            }
            else{
                singleDigit += n;
            }
        }
        if(singleDigit == twoDigit) return false;
        else return true;
    }
}
