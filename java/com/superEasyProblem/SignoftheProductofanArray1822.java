package com.superEasyProblem;

public class SignoftheProductofanArray1822 {
    public int arraySign(int[] nums) {
        int n = 0;
        int product = 1;
        for(int i = 0; i< nums.length; i++){
            int m= nums[i];
            product *= m;
            if(m ==0){
                return 0;
            }
            else if(m < 0){
                n++;
            }
        }

        if(n %2 == 0 || product > 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        else return -1;

    }
}
