package com.superEasyProblem;

public class ThreeConsecutiveOdds1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            int n = arr[i];
            if(n % 2 == 1 && i + 2 < arr.length){
                int m = arr[i+1];
                int l = arr[i + 2];
                if(m % 2 == 1 && l % 2 == 1){
                    return true;
                }
                i +=1;
            }
        }
        return false;
    }
}
